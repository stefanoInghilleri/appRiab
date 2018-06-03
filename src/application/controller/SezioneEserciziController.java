package application.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import model.Esercizio;
import model.Model;
import model.Paziente;
import model.Seduta;

public class SezioneEserciziController {

	private Model model;
	private Main main;
	private Paziente paziente;
	private Seduta seduta;
	private Esercizio esCorrente;
	
	@FXML
    private TextField txtRipetizioni;
	
	@FXML
    private Label txtUser;
	
	@FXML
    private TextField txtOra;
	
	@FXML
    private TextField txtGiorno;
	
	@FXML
    private TextField txtSerie;

	@FXML
    private WebView webVideo;
	
	@FXML
    private TextArea txtDescrizioneEs;
	
	@FXML
    private ProgressBar barProgresso;
	
	  @FXML
	    void getConsigliUtili(ActionEvent event) throws IOException {
	    	main.showSezioneConsigli(paziente, seduta);
	    }
	  
	  @FXML
	    void doEsercizioSeguente(ActionEvent event) throws IOException {
	    	
	    }
	  
	  @FXML
	    void getInfoEsercizio(ActionEvent event) throws IOException {
	    	
	    }

	public void setModel(Model model, Main main, Paziente p, Seduta s) {
		this.model=model;
		this.main=main;
		this.txtUser.setText(p.getNome()+ " "+p.getCognome());
		this.paziente=p;
		this.seduta=s;
		this.txtDescrizioneEs.appendText(s.getEsMattino().get(0).getTipo()+"\n\n"+
		s.getEsMattino().get(0).getDescrizione());
		
		this.txtGiorno.setText(p.getNumeroSedute()+"");
		this.txtOra.setText(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute());
		this.txtRipetizioni.setText(s.getRipetizioni());
		this.txtSerie.setText(s.getNote());
	}
	

}
