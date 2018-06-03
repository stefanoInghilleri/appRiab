package model;

public class DomandaWomac {
	
	private int idDomanda;
	private String notaBene;
	private String domanda;
	private int risposta;
	private boolean contato;
	
	public DomandaWomac(int idDomanda, String notaBene, String domanda) {
		this.idDomanda = idDomanda;
		this.notaBene = notaBene;
		this.domanda = domanda;
		this.contato=false;
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

	public int getRisposta() {
		return risposta;
	}

	public void setRisposta(int punteggio) {
		this.risposta = punteggio;
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

	public void setContato(boolean b) {
		this.contato=b;
		
	}

	public boolean isContato() {
		return contato;
	}
	
	

}
