package application.controller;

import java.io.IOException;
import java.util.List;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.DomandaWomac;
import model.Model;
import model.Paziente;

public class ProtocolloWomacController {

	Main main;
	Model model;
	private Paziente paziente;
	private List<DomandaWomac> domande;
	private int cntDom;
	
	   @FXML
	    private TextArea txtNb;

	    @FXML
	    private Label txtUser;

	    @FXML
	    private TextArea txtDomandaWomac;

	    @FXML
	    private ToggleGroup womac;
	    
	

	    @FXML
	    private Button btnProcedi;

	
	
	 @FXML
	    void doForward(ActionEvent event) throws IOException {
		 
		 if(cntDom<24){
		 this.txtDomandaWomac.clear();
		 this.txtDomandaWomac.setText(domande.get(cntDom-1).getDomanda());
		 this.txtNb.clear();
		 this.txtNb.setText(domande.get(cntDom-1).getNotaBene());
		 RadioButton selected = (RadioButton) womac.getSelectedToggle();
		 domande.get(cntDom-1).setPunteggio(Integer.parseInt(selected.getId()));
		 cntDom++;
		 }
		 if(this.cntDom==24){
			 this.btnProcedi.setVisible(true);
		 }
	 }

	 @FXML
	    void doProcedi(ActionEvent event) throws IOException {
		 
		 
		 RadioButton selected = (RadioButton) womac.getSelectedToggle();
		 domande.get(domande.size()-1).setPunteggio(Integer.parseInt(selected.getId()));
		 System.out.println(domande.size());
		 String indicazione=model.calcolaPunteggio(domande, paziente);
		 paziente.setIndicazione(indicazione);
		 main.showPunteggioWomac(paziente);
	 }
	 
	 @FXML
	    void doBack(ActionEvent event) throws IOException {
		 
		 if(cntDom>1){
		 cntDom--;
		 this.txtDomandaWomac.clear();
		 this.txtDomandaWomac.setText(domande.get(cntDom-1).getDomanda());
		 this.txtNb.clear();
		 this.txtNb.setText(domande.get(cntDom-1).getNotaBene());
		 }
	 }
	 
	public void setModel(Model model, Main main, Paziente p) {
		this.model=model;
		this.main=main;
		this.paziente=p;
		this.txtUser.setText(p.getNome()+" "+p.getCognome());
		domande=model.getDomandeWomac();
		this.txtNb.setText(domande.get(0).getNotaBene());
		this.txtDomandaWomac.setText(domande.get(0).getDomanda());
		this.cntDom=domande.get(0).getIdDomanda();
	}

}
