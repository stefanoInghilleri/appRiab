package application.controller;

import java.io.IOException;
import java.util.List;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import model.Model;
import model.Paziente;
import model.Seduta;
import model.Warning;

public class SezioneConsigliController {
	
	 Model model;
	 Main main;
	 private Paziente p;
	 private Seduta seduta;
	
	private Label nomeUtente;
	
    @FXML
    private HBox boxCategoria;
    
    @FXML
    private HBox boxTipo;
	
	@FXML
    private TextArea txtDescrizioneConsigli;
	

    @FXML
    private ChoiceBox<String> choiceTipo;
    

    @FXML
    private ChoiceBox<String> choiceCategoria;

    @FXML
    void getConsiglio(ActionEvent event) {
    	
    	this.txtDescrizioneConsigli.clear();
    	String result=this.choiceTipo.getSelectionModel().getSelectedItem();
    	List<Warning> warning=model.getAllWarning();
    	String result2 ="";
    	for(Warning w: warning){
    		if(result.equals(w.getTipologia())){
    			
    			String x[]=w.getDescrizione().split(" ");
    			
    			for(int j=0; j<x.length;j++){
    				
    				result2+=x[j]+" ";	
    				
    				if(j%10==0 && j!=0)
    					result2+="\n";
    			}
    			this.txtDescrizioneConsigli.appendText(result2);
    		}
    			
    	}
    }
    
    @FXML
    void getTipologia(ActionEvent event) {

    	this.txtDescrizioneConsigli.clear();
    	this.choiceTipo.getItems().clear();
    	List<Warning> warning=model.getAllWarning();
    	String result=this.choiceCategoria.getSelectionModel().getSelectedItem();
    	
    	for(Warning w: warning){
    		if(result.equals(w.getCategoria()))
    			this.choiceTipo.getItems().add(w.getTipologia());
    	}
    }

    @FXML
    void getTornaAreaP(ActionEvent event) throws IOException {
    
  
	    	main.showDopoLogin(p);
	    }

	public void setModel(Model model, Main main, Paziente p, Seduta s) {
		this.model=model;
		this.main=main;
		this.p=p;
		this.nomeUtente=new Label(p.getNome()+" "+p.getCognome());
		this.seduta=s;
		this.choiceCategoria.getItems().addAll("Generale","Sdraiato","Seduto","In piedi","Da evitare");
	}



	
}
