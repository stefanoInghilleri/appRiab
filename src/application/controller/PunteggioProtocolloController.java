package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Model;
import model.Paziente;

public class PunteggioProtocolloController {
	
	
	Main main;
	Model model;
	
	@FXML
	private Label txtUser;

	 @FXML
	    private TextArea txtIndicazioni;
	 
	 @FXML
	    private TextField txtPunteggioWomac;
	 	
		 @FXML
		    void doProcedi(ActionEvent event) throws IOException {
			 
			 main.showLoginForm();
		 }

		public void setModel(Model model, Main main, Paziente p) {
			this.main=main;
			this.model=model;
			this.txtUser.setText(p.getNome()+" "+p.getCognome());
			this.txtPunteggioWomac.setText(p.getPunteggioWomac1()+"");
			
			String x[]=p.getIndicazione().split(" ");
			String result="";
			for(int j=0; j<x.length;j++){
				
				result+=x[j]+" ";	
				
				if(j%7==0 && j!=0)
					result+="\n";
			}
			this.txtIndicazioni.setText(result);
		}
}
