package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import model.Model;

public class VideoConsiglioController {
	
	private Model model;
	private Main main;
	
	@FXML
	private WebView webVideoConsiglio;
	
	  @FXML
	    void getSelezionaConsiglio(ActionEvent event) throws IOException {
	    	
	    }

	public void setModel(Model model, Main main) {
		this.model=model;
		this.main=main;
	}

}
