package model;

public class PunteggiWomac {
	
	private int idPunteggio;
	private String range;
	private String indicazione;
	
	public PunteggiWomac(int idPunteggio, String range, String indicazione) {
		this.idPunteggio = idPunteggio;
		this.range = range;
		this.indicazione = indicazione;
	}
	public int getIdPunteggio() {
		return idPunteggio;
	}
	public void setIdPunteggio(int idPunteggio) {
		this.idPunteggio = idPunteggio;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getIndicazione() {
		return indicazione;
	}
	public void setIndicazione(String indicazione) {
		this.indicazione = indicazione;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPunteggio;
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
		PunteggiWomac other = (PunteggiWomac) obj;
		if (idPunteggio != other.idPunteggio)
			return false;
		return true;
	}
	
	

}
