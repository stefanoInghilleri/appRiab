package model;

public class Esercizio {
	
	private int idEsercizio;
	private String tipo;
	private String videoURL;
	private String descrizione;
	
	public Esercizio(int idEsercizio, String tipo, String descrizione, String videourl) {
		this.idEsercizio = idEsercizio;
		this.tipo = tipo;
		this.descrizione = descrizione;
		this.videoURL=videourl;
	}

	public int getIdEsercizio() {
		return idEsercizio;
	}

	public void setIdEsercizio(int idEsercizio) {
		this.idEsercizio = idEsercizio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEsercizio;
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
		Esercizio other = (Esercizio) obj;
		if (idEsercizio != other.idEsercizio)
			return false;
		return true;
	}
	
	

}
