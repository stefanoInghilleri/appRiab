package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Model;
import model.Paziente;

public class LoginController {

	Main main;
	Model model;
	
    @FXML
    private TextField txtNomeLogin;

    @FXML
    private TextField txtCognomeLogin;
    
    @FXML
    private Label txtInfoLogin;

    @FXML
    void doLogin(ActionEvent event) throws IOException {
    	
    	Paziente p=null;
    	
    	p= model.checkLogin(this.txtNomeLogin.getText(),this.txtCognomeLogin.getText());
    	if(p!=null)
    		main.showDopoLogin(p);
    	else{
    		this.txtInfoLogin.setText("*Attenzione nome o cognome errati");
    		this.txtNomeLogin.clear();
    		this.txtCognomeLogin.clear();
    	}
    	
    }
	
	public void setModel(Model model, Main main) {
		
		this.model=model;
		this.main=main;
	}

}
