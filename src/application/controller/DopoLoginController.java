package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Model;

public class DopoLoginController {
	
	Model model;
	Main main;
	
	    @FXML
	    private Label txtNomeUtente;

	    @FXML
	    void getIniziaEsercizi(ActionEvent event) throws IOException {
	    	main.showSezioneEsercizi(txtNomeUtente.getText());
	    }

	    @FXML
	    void getConsigliUtili(ActionEvent event) throws IOException {
	    	System.out.println(txtNomeUtente.getText());
	    	main.showSezioneConsigli(txtNomeUtente.getText());
	    }

	public void setModel(Model model, Main main, String nome, String cognome) {
		this.model=model;
		this.main=main;
		this.txtNomeUtente.setText(nome+" "+cognome);
	}

}
