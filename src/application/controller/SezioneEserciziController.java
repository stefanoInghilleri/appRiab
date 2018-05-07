package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import model.Model;

public class SezioneEserciziController {

	private Model model;
	private Main main;
	
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
	    	main.showSezioneConsigli(txtUser.getText());
	    }
	  
	  @FXML
	    void doEsercizioSeguente(ActionEvent event) throws IOException {
	    	
	    }
	  
	  @FXML
	    void getInfoEsercizio(ActionEvent event) throws IOException {
	    	
	    }

	public void setModel(Model model, Main main, String nomeUtente) {
		this.model=model;
		this.main=main;
		this.txtUser.setText(nomeUtente);
	}
	

}
