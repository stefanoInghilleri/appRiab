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
	private static int cntDom=1;
	
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
		 
		
		 try{
		 
		 if(cntDom==24)
			 this.btnProcedi.setVisible(true);
		
		 else{ 
		 if(cntDom<23){
	    
			 this.txtDomandaWomac.clear();
			 this.txtDomandaWomac.setText(domande.get(cntDom).getDomanda());
			 this.txtNb.clear();
			 this.txtNb.setText(domande.get(cntDom).getNotaBene());
			 
			 if(!domande.get(cntDom+1).isContato() ){
	     
				 RadioButton selected = (RadioButton) womac.getSelectedToggle();
				 domande.get(cntDom).setRisposta(Integer.parseInt(selected.getId()));
				 domande.get(cntDom).setContato(true);
				 womac.getSelectedToggle().setSelected(false);
				 cntDom++;
			 }
			 else{
				 womac.getToggles().get(domande.get(cntDom+1).getRisposta()).setSelected(true);	
				 cntDom++;
				 this.txtDomandaWomac.clear();
				 this.txtDomandaWomac.setText(domande.get(cntDom+1).getDomanda());
				 this.txtNb.clear();
				 this.txtNb.setText(domande.get(cntDom+1).getNotaBene());
			 }
			 
		 }
		 
		 else{
			 this.txtDomandaWomac.clear();
			 this.txtDomandaWomac.setText(domande.get(cntDom).getDomanda());
			 this.txtNb.clear();
			 this.txtNb.setText(domande.get(cntDom).getNotaBene());
			 RadioButton selected = (RadioButton) womac.getSelectedToggle();
			 domande.get(cntDom).setRisposta(Integer.parseInt(selected.getId()));
			 domande.get(cntDom).setContato(true);
			 womac.getSelectedToggle().setSelected(false);
			 cntDom++;
		 }
		 }
		 }catch(Exception e){
			 this.txtDomandaWomac.setText("Attenzione! Assicurati di aver selezionato la domanda");
		 }
	 }
	 /**
	  * test 1
	  * */

	 @FXML
	    void doProcedi(ActionEvent event) throws IOException {
		 
		 RadioButton selected = (RadioButton) womac.getSelectedToggle();
		 domande.get(23).setRisposta(Integer.parseInt(selected.getId()));

		 String indicazione=model.calcolaPunteggio(domande, paziente);
		 paziente.setIndicazione(indicazione);
		 main.showPunteggioWomac(paziente);
	 }
	 
	 @FXML
	    void doBack(ActionEvent event) throws IOException {
		 

		 if(cntDom>1){
		 cntDom--;
		 System.out.println("domanda numero" +cntDom+" risposta: "+domande.get(cntDom).getRisposta());
		 womac.getToggles().get(domande.get(cntDom).getRisposta()).setSelected(true);
		 this.txtDomandaWomac.clear();
		 this.txtDomandaWomac.setText(domande.get(cntDom).getDomanda());
		 this.txtNb.clear();
		 this.txtNb.setText(domande.get(cntDom).getNotaBene());
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
		
	}

}
