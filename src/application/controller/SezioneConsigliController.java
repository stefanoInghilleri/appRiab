package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Model;
import model.Warning;

public class SezioneConsigliController {
	
	 Model model;
	 Main main;
	
	private Label nomeUtente;
	
	@FXML
    private TextArea txtDescrizioneConsigli;
	
	@FXML
    private ListView<Warning> listConsigliUtili;
	
	  @FXML
	    void getVideoConsigli(ActionEvent event) throws IOException {
	    	main.showVideoConsiglio();
	    }
	 
	  @FXML
	    void getTornaAreaP(ActionEvent event) throws IOException {
	    	main.showSezioneEsercizi(nomeUtente.getText());
	    }

	public void setModel(Model model, Main main, String nomeU) {
		this.model=model;
		this.main=main;
		this.nomeUtente=new Label(nomeU);
	//	this.nomeUtente.setText(nomeU);
	}



	
}
