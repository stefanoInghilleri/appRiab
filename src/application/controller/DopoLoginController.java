package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import model.Model;
import model.Paziente;
import model.Seduta;

public class DopoLoginController {
	
	Model model;
	Main main;
	private Paziente paziente;
	private Seduta seduta;
	
	    @FXML
	    private Label txtNomeUtente;
	    
	    @FXML
	    private ProgressBar barProgresso;

	    @FXML
	    private TextField txtPunt1;

	    @FXML
	    private TextField txtPunt2;

	    @FXML
	    private TextField txtPunt3;

	    @FXML
	    private TextField txtPunt4;
	    
	    @FXML
	    private ProgressIndicator progInd;

	    @FXML
	    void contattaIlMedico(ActionEvent event) {

	    }

	    @FXML
	    void getIniziaEsercizi(ActionEvent event) throws IOException {
	    
	    	main.showSezioneEsercizi(paziente, seduta);
	    }

	    @FXML
	    void getConsigliUtili(ActionEvent event) throws IOException {
	    	main.showSezioneConsigli(paziente, seduta);
	    }

	public void setModel(Model model, Main main, Paziente paziente) {
		this.model=model;
		this.main=main;
		this.paziente=paziente;
		this.txtNomeUtente.setText(paziente.getNome()+" "+paziente.getCognome());
		seduta=model.areaPersonale(paziente);
		this.txtPunt1.setText(paziente.getPunteggioWomac1()+"/96");
		this.txtPunt2.setText(paziente.getPunteggioWomac2()+"/96");
		this.txtPunt3.setText(paziente.getPunteggioWomac3()+"/96");
		this.txtPunt4.setText(paziente.getPunteggioWomac4()+"/96");
		
		this.barProgresso.setProgress((double)paziente.getNumeroSedute()/56);
		this.progInd.setProgress((double)paziente.getNumeroSedute()/56);
	}

}
