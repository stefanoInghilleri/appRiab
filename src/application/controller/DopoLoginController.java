package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
		seduta=model.areaPersonale(paziente);
	}

}
