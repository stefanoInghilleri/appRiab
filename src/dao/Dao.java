package dao;


import java.sql.Connection;
import javafx.scene.control.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import model.DomandaWomac;
import model.Esercizio;
import model.Paziente;
import model.PunteggiWomac;
import model.Seduta;
import model.Warning;

public class Dao {

	public void inserisciPaziente(Paziente paziente) 
	{
	String sql= "insert into pazienti values (?,?,?,?,?,?,?,?)"; 
	 try
	        {
	            Connection conn = ConnectDB.getConnection();
	            PreparedStatement st = conn.prepareStatement(sql);
	            st.setInt(1, paziente.getIdPaziente());
	            st.setString(2, paziente.getNome());
	            st.setString(3, paziente.getCognome());
	            st.setDate(4, Date.valueOf(paziente.getEtà()));
	            st.setString(5, paziente.getSesso());
	            st.setString(6, paziente.getTipoIntervento());
	            st.setString(7, paziente.getArtoInteressato());
	            st.setInt(8, 0);
	            st.executeUpdate();
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	    }

	public List<Warning> getAllWarning()
	    {
	        String sql = "select  * from warning";
	        try
	        {
	            Connection conn = ConnectDB.getConnection();
	            PreparedStatement st = conn.prepareStatement(sql);
	            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
	            List<Warning> list = new ArrayList<>();
	      
	            while(rs.next()){                  // fino a quando non trova una linea vuota continua ad aggiungere
	            list.add(new Warning(rs.getInt("ID"),rs.getString("tipologia") ,rs.getString("CONSIGLI_E_PRECAUZIONI")));
	
	            }
	            conn.close();
	            return list;
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return null;
	    }


	public Seduta getSedutaGiornaliera(int giorno)
	    {
	        String sql = "select  * from es_2_mesi where giorno=?";
	        Seduta sedutaGiornaliera=null;
	        try
	        {
	            Connection conn = ConnectDB.getConnection();
	            PreparedStatement st = conn.prepareStatement(sql);
	            st.setInt(1, giorno);
	            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
	            if(rs.next()){
					
	            	sedutaGiornaliera= new Seduta(rs.getInt("Giorno"),rs.getString("Es_mattino"),rs.getString("Es_pomeriggio"),rs.getString("Ripetizioni"),rs.getString("Note"));
			}
	            
	            conn.close();
	            return sedutaGiornaliera;
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return null;
	    }



	public Esercizio getEsercizio(int idEsercizio)
	    {
	        String sql = "select  * from descrizione_es ";
	        try
	        {
	            Connection conn = ConnectDB.getConnection();
	            PreparedStatement st = conn.prepareStatement(sql);
	            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
	            Esercizio esercizio=null;
	            while(rs.next()){
					
			esercizio= new Esercizio(rs.getInt("ID"),
					rs.getString("Tipologia"),rs.getString("Descrizione"),
					rs.getString("videourl"));
			}
	            
	            conn.close();
	            return esercizio;
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return null;
	    }

	public List<Paziente> getAllPazienti()
    {
        String sql = "select * from pazienti ";
        try
        {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
            List<Paziente> pazienti=new LinkedList<>();
            while(rs.next()){
				
		pazienti.add(new Paziente(rs.getInt("Id_Paziente"),rs.getString("nome"),rs.getString("cognome"), rs.getDate("eta").toLocalDate(),
				rs.getString("sesso"), rs.getString("tipo_intervento"), rs.getString("arto_interessato"), rs.getInt("punteggio_womac"),
				 rs.getInt("numeroSedute"),rs.getDate("seduta1").toLocalDate()));
		}
            
            conn.close();
            return pazienti;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
	
	
	public Paziente checkLogin(String nome, String cognome, Map<Integer, Paziente> pazienti) {
		  String sql = "select id_paziente from pazienti where nome=? and cognome=?";
	  
		  try
	        {
	            Connection conn = ConnectDB.getConnection();
	            PreparedStatement st = conn.prepareStatement(sql);
	            st.setString(1, nome);
	            st.setString(2, cognome);
	            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
	           if(rs.next())
	        	   return pazienti.get(rs.getInt("id_paziente"));
	          
	            conn.close();

	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return null;
	}

	public List<DomandaWomac> getDomandeWomac() {
		String sql = "select idDomanda, NB, Domande from womac_questionario";
        try
        {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
            List<DomandaWomac> domande =new LinkedList<>();
            while(rs.next()){
				
		domande.add(new DomandaWomac(rs.getInt("IdDomanda"),rs.getString("NB")
				,rs.getString("domande")));
				}
            
            conn.close();
            return domande;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
	}

	public List<PunteggiWomac> getAllPunteggi() {
		String sql = "select * from punteggio";
        try
        {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();             // restituisce i dati della tabella
            List<PunteggiWomac> punteggi =new LinkedList<>();
            while(rs.next()){
				
		punteggi.add(new PunteggiWomac(rs.getInt("Id"),rs.getString("Punteggio")
				,rs.getString("Risultato")));
				}
            
            conn.close();
            return punteggi;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
	}

	public void aggiornaPaziente(Paziente paziente) {
		 
		String sql = "UPDATE pazienti SET punteggio_Womac=?, numeroSedute=? WHERE id_Paziente=?";
	        try
	        {
	            Connection conn = ConnectDB.getConnection();
	            PreparedStatement st = conn.prepareStatement(sql);
	            st.setInt(1, paziente.getPunteggioWomac());
	            st.setInt(2, paziente.getNumeroSedute());
	            st.setInt(3, paziente.getIdPaziente());
	            st.executeUpdate();
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	}




	
}
