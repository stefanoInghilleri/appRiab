package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Paziente {
	
	private int idPaziente;
	private String nome;
	private String cognome;
	private LocalDate et�;
	private String sesso;
	private String tipoIntervento;
	private String artoInteressato;
	private int punteggioWomac1;
	private int punteggioWomac2;
	private int punteggioWomac3;
	private int punteggioWomac4;
	private String indicazione;
	private int numeroSedute;
	private LocalDate primaSeduta;
	
	public Paziente(int idPaziente, String nome, String cognome, LocalDate et�, String sesso, String tipoIntervento, 
			String artoInteressato, int punteggioWomac1,int punteggioWomac2,int punteggioWomac3,int punteggioWomac4,
			int numSedute,LocalDate primaSeduta) {
		
		this.idPaziente=idPaziente;
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
		this.sesso = sesso;
		this.tipoIntervento = tipoIntervento;
		this.artoInteressato = artoInteressato;
		this.punteggioWomac1=punteggioWomac1;
		this.punteggioWomac2=punteggioWomac2;
		this.punteggioWomac3=punteggioWomac3;
		this.punteggioWomac4=punteggioWomac4;
		this.primaSeduta=primaSeduta;
		this.numeroSedute=numSedute;
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

	public LocalDate getEt�() {
	
		return et�;
	}

	public void setEt�(LocalDate et�) {
		this.et� = et�;
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

	public int getPunteggioWomac1() {
		return punteggioWomac1;
	}

	public void setPunteggioWomac1(int punteggioWomac) {
		this.punteggioWomac1 = punteggioWomac;
	}

	
	
	public int getPunteggioWomac2() {
		return punteggioWomac2;
	}

	public void setPunteggioWomac2(int punteggioWomac2) {
		this.punteggioWomac2 = punteggioWomac2;
	}

	public int getPunteggioWomac3() {
		return punteggioWomac3;
	}

	public void setPunteggioWomac3(int punteggioWomac3) {
		this.punteggioWomac3 = punteggioWomac3;
	}

	public int getPunteggioWomac4() {
		return punteggioWomac4;
	}

	public void setPunteggioWomac4(int punteggioWomac4) {
		this.punteggioWomac4 = punteggioWomac4;
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
		return "Paziente [nome=" + nome + ", cognome=" + cognome + ", et�=" + et� + ", sesso=" + sesso
				+ ", tipoIntervento=" + tipoIntervento + ", artoInteressato=" + artoInteressato + "]";
	}

	public void setIndicazione(String indicazione) {
		this.indicazione=indicazione;
	}

	public String getIndicazione() {
		return indicazione;
	}

	public LocalDate getPrimaSeduta() {
		// TODO Auto-generated method stub
		return primaSeduta;
	}

	public int getNumeroSedute() {
		
		return numeroSedute;
	}

	public void setPrimaSeduta(LocalDate primaSeduta) {
		this.primaSeduta = primaSeduta;
	}

	public void setNumeroSedute(int numeroSeduta) {
		this.numeroSedute=numeroSeduta;
		
	}

	
	
}
