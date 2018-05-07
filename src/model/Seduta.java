package model;

import java.util.*;

public class Seduta {
	
	private int giorno;
	private String esParte1;
	private String esParte2;
	private String ripetizioni;
	private String note;
	
	private List<Integer> esMattino;
	private List<Integer> esPomeriggio;
	
	public Seduta(int giorno, String esParte1, String esParte2, String ripetizioni, String note) {
		this.giorno = giorno;
		this.esParte1 = esParte1;
		this.esParte2 = esParte2;
		this.ripetizioni = ripetizioni;
		this.note = note;
		this.setEsMattino(esParte1);
		this.setEsPomeriggio(esParte2);
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
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

	public String getRipetizioni() {
		return ripetizioni;
	}

	public void setRipetizioni(String ripetizioni) {
		this.ripetizioni = ripetizioni;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Integer> getEsMattino() {
		return esMattino;
	}

	public void setEsMattino(String esMatt) {
		
		this.esMattino=new LinkedList<>();
		StringTokenizer st = new StringTokenizer(esMatt,";");  
		     
		   while (st.hasMoreTokens()) {  
			   esMattino.add(Integer.parseInt(st.nextToken()));
		     }  
	}

	public List<Integer> getEsPomeriggio() {
		return esPomeriggio;
	}

	public void setEsPomeriggio(String esPome) {
		this.esPomeriggio=new LinkedList<>();
		StringTokenizer st = new StringTokenizer(esPome,";");  
		     
		   while (st.hasMoreTokens()) {  
			   esPomeriggio.add(Integer.parseInt(st.nextToken()));
		     }
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + giorno;
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
		if (giorno != other.giorno)
			return false;
		return true;
	}
	
	

}
