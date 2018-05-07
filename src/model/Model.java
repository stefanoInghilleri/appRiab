package model;

import java.util.*;

import dao.Dao;

public class Model {

	private Dao dao;
	private Map<Integer, Paziente> mapPazienti;
	private List<DomandaWomac> domande;
	private List<PunteggiWomac> punteggi;
	private List<Warning> consigli;
	
	public Model(){
		this.dao= new Dao();
		this.mapPazienti= new HashMap<Integer,Paziente>();
		for(Paziente p: dao.getAllPazienti()){
			this.mapPazienti.put(p.getIdPaziente(), p);
		}
		this.punteggi=dao.getAllPunteggi();
		this.consigli=dao.getAllWarning();
	}

	public void insertPaziente(Paziente p) {
		
		System.out.println(mapPazienti.values());
		int idPaziente; 
		if(!this.mapPazienti.isEmpty())
		 idPaziente= mapPazienti.get(mapPazienti.size()).getIdPaziente() + 1;
		else
			idPaziente=1;
		p.setIdPaziente(idPaziente);
		mapPazienti.put(p.getIdPaziente(), p);
		dao.inserisciPaziente(p);
	}

	public boolean checkLogin(String nome, String cognome) {
		
		boolean found=dao.checkLogin(nome,cognome);
		
		return found;
	}

	public List<DomandaWomac> getDomandeWomac() {
		domande = dao.getDomandeWomac();
		
		return domande;
	}

	public String calcolaPunteggio(List<DomandaWomac> domande, Paziente paziente) {
		int puntiTot=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(DomandaWomac dw: domande){
			puntiTot+=dw.getPunteggio();
		}
		paziente.setPunteggioWomac(puntiTot);
		for(PunteggiWomac p: punteggi){
			StringTokenizer st = new StringTokenizer(p.getRange(),"-");  
		     
			   while (st.hasMoreTokens()) {  
				   min=Integer.parseInt(st.nextToken());
				   max=Integer.parseInt(st.nextToken());
			     }
			   if(paziente.getPunteggioWomac()>=min && paziente.getPunteggioWomac()<=max){
				   
				//   dao.salvaPunteggioWomac(paziente);
				   return p.getIndicazione();
			   }
		}
		return null;
	}

	public List<Warning> getConsigli() {
		return consigli;
	}
	
}
