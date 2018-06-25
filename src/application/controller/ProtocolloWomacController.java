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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
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
	    private ToggleGroup womac;
	    
	    @FXML
	    private Button btnAvanti;
	
	    @FXML
	    private Button btnProcedi;

	
	
	 @FXML
	    void doForward(ActionEvent event) throws IOException {
		 
		
		 try{
		 
		 if(cntDom<23){
	  	 this.txtNb.clear();
			 this.txtNb.setText(domande.get(cntDom).getNotaBene());
			 this.txtNb.appendText("\n\n"+domande.get(cntDom).getDomanda());
			 
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
				 this.txtNb.clear();
				 this.txtNb.setText(domande.get(cntDom+1).getNotaBene());
				 this.txtNb.appendText("\n\n"+domande.get(cntDom+1).getDomanda());
			 }
			 
		 }
		 
		 else if(cntDom==23){
			 womac.getSelectedToggle().setSelected(false);
			 this.btnAvanti.setVisible(false);
			 this.btnProcedi.setVisible(true);
			 this.txtNb.clear();
			 this.txtNb.setText(domande.get(cntDom).getNotaBene());
			 this.txtNb.appendText("\n\n"+domande.get(cntDom).getDomanda());
			// RadioButton selected = (RadioButton) womac.getSelectedToggle();
			 //domande.get(cntDom).setRisposta(Integer.parseInt(selected.getId()));
			 //domande.get(cntDom).setContato(true);
			 //womac.getSelectedToggle().setSelected(false);
		 	}
		 }catch(Exception e){
			 Text t=new Text();
			 t.setText("Attenzione! Assicurati di aver selezionato la risposta");
	
		 }
	 }


	 @FXML
	    void doProcedi(ActionEvent event) throws IOException {
		 
		 RadioButton selected = (RadioButton) womac.getSelectedToggle();
		 domande.get(cntDom).setRisposta(Integer.parseInt(selected.getId()));
		 String indicazione=model.calcolaPunteggio(domande, paziente);
		 paziente.setIndicazione(indicazione);
		 main.showPunteggioWomac(paziente);
	 }
	 
	 @FXML
	    void doBack(ActionEvent event) throws IOException {
		 
		 if(cntDom==24){
			 this.btnAvanti.setVisible(true);
			this.btnProcedi.setVisible(false); 
		 }

		 if(cntDom>1){
		 cntDom--;
		 womac.getToggles().get(domande.get(cntDom).getRisposta()).setSelected(true);
		 this.txtNb.clear();
		 this.txtNb.setText(domande.get(cntDom).getNotaBene());
		 this.txtNb.appendText("\n\n"+domande.get(cntDom).getDomanda());
		 }
	 }
	 
	public void setModel(Model model, Main main, Paziente p) {
	
		this.model=model;
		this.main=main;
		this.paziente=p;
		this.txtUser.setText(p.getNome()+" "+p.getCognome());
		domande=model.getDomandeWomac();
		this.txtNb.setText(domande.get(0).getNotaBene());
		 this.txtNb.appendText("\n\n"+domande.get(0).getDomanda());
	}

}
