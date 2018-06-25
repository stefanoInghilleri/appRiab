package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Model;
import model.Paziente;

public class DatiPazienteController {
	
	Model model;
	Main main;
	
	   @FXML
	    private TextField txtNome;

	    @FXML
	    private TextField txtCognome;

	    @FXML
	    private ChoiceBox<String> choiceSesso;

	    @FXML
	    private ChoiceBox<String> choiceTipoIntervento;

	    @FXML
	    private ChoiceBox<String> choiceArtoInteressato;

	    @FXML
	    private DatePicker txtEtà;

	    @FXML
	    void doInsert(ActionEvent event) throws IOException {
	    	
	    	Paziente p=new Paziente();
	    	p.setNome(this.txtNome.getText());
	    	p.setCognome(this.txtCognome.getText());
	    	p.setEtà(this.txtEtà.getValue());
	    	p.setSesso(this.choiceSesso.getValue());
	    	p.setTipoIntervento(this.choiceTipoIntervento.getValue());
	    	p.setArtoInteressato(this.choiceArtoInteressato.getValue());
	    	
	    	model.insertPaziente(p);
	    	main.showProtocolloWomac(p);
	    	
	    }

	public void setModel(Main main, Model model) {
		this.model=model;
		this.main=main;
		this.choiceSesso.getItems().addAll("Femmina","Maschio");
		this.choiceTipoIntervento.getItems().addAll("Anca","Ginocchio");
		this.choiceArtoInteressato.getItems().addAll("Destro","Sinistro");
	}

}
