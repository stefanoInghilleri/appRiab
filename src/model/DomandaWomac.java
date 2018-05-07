package model;

public class DomandaWomac {
	
	private int idDomanda;
	private String notaBene;
	private String domanda;
	private int punteggio;
	
	public DomandaWomac(int idDomanda, String notaBene, String domanda) {
		this.idDomanda = idDomanda;
		this.notaBene = notaBene;
		this.domanda = domanda;
	}

	public int getIdDomanda() {
		return idDomanda;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	public String getNotaBene() {
		return notaBene;
	}

	public void setNotaBene(String notaBene) {
		this.notaBene = notaBene;
	}

	public String getDomanda() {
		return domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDomanda;
		return result;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DomandaWomac other = (DomandaWomac) obj;
		if (idDomanda != other.idDomanda)
			return false;
		return true;
	}
	
	

}
