package model;

import java.time.LocalDate;
import java.util.*;

import dao.Dao;

public class Model {

	private Dao dao;
	private Map<Integer, Paziente> mapPazienti;
	private List<DomandaWomac> domande;
	private List<PunteggiWomac> punteggi;
	private List<Warning> consigli;
	private LocalDate sedutaGiorno1;

	
	public Model(){
		this.dao= new Dao();
		this.mapPazienti= new HashMap<Integer,Paziente>();
		for(Paziente p: dao.getAllPazienti()){
			this.mapPazienti.put(p.getIdPaziente(), p);
		}
		this.punteggi=dao.getAllPunteggi();
		this.consigli=dao.getAllWarning();

		}

	private void refresh(){
		this.mapPazienti.clear();
		for(Paziente p: dao.getAllPazienti()){
			this.mapPazienti.put(p.getIdPaziente(), p);
		}
	}
	
	public void insertPaziente(Paziente p) {
		
	
		int idPaziente; 
		if(!this.mapPazienti.isEmpty())
			
		 idPaziente= mapPazienti.get(mapPazienti.size()).getIdPaziente() + 1;
		else
			idPaziente=1;
		p.setIdPaziente(idPaziente);
		mapPazienti.put(p.getIdPaziente(), p);
		dao.inserisciPaziente(p);
	}

	public Paziente checkLogin(String nome, String cognome) {
		
		Paziente p=dao.checkLogin(nome,cognome, mapPazienti);
		if (p!=null)
			return p;
		
		return null;
	}

	public List<DomandaWomac> getDomandeWomac() {
		domande = dao.getDomandeWomac();
		String result="";
		
		for(int i=0;i<domande.size();i++){
		String x[]=domande.get(i).getDomanda().split(" ");
		
		for(int j=0; j<x.length;j++){
			
			result+=x[j]+" ";	
			
			if(j%9==0 && j!=0)
				result+="\n";
		}
		domande.get(i).setDomanda(result);
		result="";
		}
		
		for(int i=0;i<domande.size();i++){
			String x[]=domande.get(i).getNotaBene().split(" ");
			
			String result2=x[0]+"\n";	
			
			for(int j=1; j<x.length;j++){

				result2+=x[j]+" ";	
				
				if(j%9==0)
					result2+="\n";
			}
			domande.get(i).setNotaBene(result2);
			result2="";
			}
		
		return domande;
	}

	public String calcolaPunteggio(List<DomandaWomac> domande, Paziente paziente) {
		int puntiTot=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(DomandaWomac dw: domande){
			puntiTot+=dw.getRisposta();
		}
		paziente.setPunteggioWomac1(puntiTot);
		for(PunteggiWomac p: punteggi){
			StringTokenizer st = new StringTokenizer(p.getRange(),"-");  
		     
			   while (st.hasMoreTokens()) {  
				   min=Integer.parseInt(st.nextToken());
				   max=Integer.parseInt(st.nextToken());
			     }
			   if(paziente.getPunteggioWomac1()>min && paziente.getPunteggioWomac1()<max){
				   
				   paziente.setPrimaSeduta(LocalDate.now());
				   dao.aggiornaPaziente(paziente);
				   return p.getIndicazione();
			   }
		}
		return null;
	}

	public List<Warning> getConsigli() {
		return consigli;
	}
	public Seduta areaPersonale(Paziente paziente){
		
		LocalDate today=LocalDate.now();
		
		int numeroSeduta=today.getDayOfYear()-paziente.getPrimaSeduta().getDayOfYear();
		
		if(numeroSeduta!=paziente.getNumeroSedute()){
			paziente.setNumeroSedute(numeroSeduta);
			dao.aggiornaPaziente(paziente);
			
		}

		if(numeroSeduta==0){
			numeroSeduta++;
			paziente.setNumeroSedute(numeroSeduta);
		}
			
		Seduta sedutaGiornaliera= dao.getSedutaGiornaliera(numeroSeduta);
		for(int i: sedutaGiornaliera.getIdMattino()){
			
			sedutaGiornaliera.setEsMattino(dao.getEsercizio(i));
	
		}
		for(int i: sedutaGiornaliera.getIdPomeriggio()){
			
			
			sedutaGiornaliera.setEsPomeriggio(dao.getEsercizio(i));
	
		}
		return sedutaGiornaliera;
	}
	public List<Warning> getAllWarning(){
		return consigli;
	}
	/**
	 * barra di progresso generale che indichi la percentuale di completamento del percorso
	 * 
	 * ogni 15 giorni obbligare l'utente a ripetere il protocollo Womac 
	 * 
	 *  
	 * 
	 * **/
}
