package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Model;

public class RiabController {
	
	
	private Main main;
	
	@FXML
	private void getDatiPaziente(ActionEvent event) throws IOException{
		main.showDatiPaziente();
	}

	
	@FXML
	private void getAreaPersonale(ActionEvent event) throws IOException{
		main.showLoginForm();
	}

	public void setMain(Main main) {
		
		this.main=main;
	}
	
}
