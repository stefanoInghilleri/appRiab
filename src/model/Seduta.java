package model;

import java.time.LocalDate;
import java.util.*;

public class Seduta {
	
	private int numeroSeduta;
	private List<Esercizio> esMattino;
	private List<Esercizio> esPomeriggio;
	private List<Integer> idMattino;
	private List<Integer> idPomeriggio;
	private String esParte1;
	private String esParte2;
	private String ripetizioni;
	private String note;
	
	public Seduta(int giorno, String esParte1, String esParte2, String ripetizioni, String note) {
		this.numeroSeduta = giorno;
		this.esParte1 = esParte1;
		this.esParte2 = esParte2;
		this.ripetizioni=ripetizioni;
		this.note=note;
		this.setIdMattino(esParte1);
		this.setIdPomeriggio(esParte2);
		this.esMattino=new LinkedList<>();
		this.esPomeriggio=new LinkedList<>();
	}

	public int getNumeroSeduta() {
		return numeroSeduta;
	}

	public String getNote() {
		return note;
	}

	public String getRipetizioni() {
		return ripetizioni;
	}

	public void setNumeroSeduta(int numeroSeduta) {
		this.numeroSeduta = numeroSeduta;
	}

	public String getEsParte1() {
		return esParte1;
	}

	public void setEsParte1(String esParte1) {
		this.esParte1 = esParte1;
	}

	public String getEsParte2() {
		return esParte2;
	}

	public void setEsParte2(String esParte2) {
		this.esParte2 = esParte2;
	}


	public List<Esercizio> getEsMattino() {
		return esMattino;
	}

	public void setEsMattino(Esercizio esMattino) {
		this.esMattino.add(esMattino);
	}

	public void setEsPomeriggio(Esercizio esPomeriggio) {
		this.esPomeriggio.add(esPomeriggio);
	}

	public void setIdMattino(String esMatt) {
		
		this.idMattino=new LinkedList<>();
		StringTokenizer st = new StringTokenizer(esMatt,";");  
		     
		  while (st.hasMoreTokens()) {  
			  
			idMattino.add(Integer.parseInt(st.nextToken().trim()));
		     }  
	}

	public List<Esercizio> getEsPomeriggio() {
		return esPomeriggio;
	}

	public void setIdPomeriggio(String esPome) {
		
		this.idPomeriggio=new LinkedList<>();
		StringTokenizer st = new StringTokenizer(esPome,";");  
		     
		   while (st.hasMoreTokens()) {  
			   idPomeriggio.add(Integer.parseInt(st.nextToken().trim()));
		     }
	}

	public List<Integer> getIdMattino() {
		return idMattino;
	}

	public List<Integer> getIdPomeriggio() {
		return idPomeriggio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroSeduta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seduta other = (Seduta) obj;
		if (numeroSeduta != other.numeroSeduta)
			return false;
		return true;
	}
	

}
