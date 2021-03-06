package model;

public class Warning {

	private int idWarning;
	private String tipologia;
	private String descrizione;
	private String categoria;
	
	public Warning(int idWarning, String categoria,String tipologia, String descrizione) {
		this.idWarning = idWarning;
		this.tipologia = tipologia;
		this.descrizione = descrizione;
		this.categoria=categoria;
	}

	public int getIdWarning() {
		return idWarning;
	}

	public void setIdWarning(int idWarning) {
		this.idWarning = idWarning;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idWarning;
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
		Warning other = (Warning) obj;
		if (idWarning != other.idWarning)
			return false;
		return true;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Warning [tipologia=" + tipologia + ", descrizione=" + descrizione + "]";
	}
	
	
	
}
