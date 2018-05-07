package model;

import java.time.LocalDate;
import java.util.Date;

public class Paziente {
	
	private int idPaziente;
	private String nome;
	private String cognome;
	private LocalDate età;
	private String sesso;
	private String tipoIntervento;
	private String artoInteressato;
	private int punteggioWomac;
	private String indicazione;
	
	public Paziente(int idPaziente, String nome, String cognome, LocalDate età, String sesso, String tipoIntervento, String artoInteressato, int punteggioWomac) {
		
		this.idPaziente=idPaziente;
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.sesso = sesso;
		this.tipoIntervento = tipoIntervento;
		this.artoInteressato = artoInteressato;
		this.punteggioWomac=punteggioWomac;
	}

	public Paziente() {
		
	}

	public int getIdPaziente() {
		return idPaziente;
	}

	public void setIdPaziente(int idPaziente) {
		this.idPaziente = idPaziente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getEtà() {
	
		return età;
	}

	public void setEtà(LocalDate età) {
		this.età = età;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getTipoIntervento() {
		return tipoIntervento;
	}

	public void setTipoIntervento(String tipoIntervento) {
		this.tipoIntervento = tipoIntervento;
	}

	public String getArtoInteressato() {
		return artoInteressato;
	}

	public void setArtoInteressato(String artoInteressato) {
		this.artoInteressato = artoInteressato;
	}

	public int getPunteggioWomac() {
		return punteggioWomac;
	}

	public void setPunteggioWomac(int punteggioWomac) {
		this.punteggioWomac = punteggioWomac;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPaziente;
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
		Paziente other = (Paziente) obj;
		if (idPaziente != other.idPaziente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paziente [nome=" + nome + ", cognome=" + cognome + ", età=" + età + ", sesso=" + sesso
				+ ", tipoIntervento=" + tipoIntervento + ", artoInteressato=" + artoInteressato + "]";
	}

	public void setIndicazione(String indicazione) {
		this.indicazione=indicazione;
	}

	public String getIndicazione() {
		return indicazione;
	}

	
	
}
