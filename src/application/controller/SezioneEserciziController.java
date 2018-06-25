package application.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.web.WebEngine;
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
	private List<Esercizio> esCorrenti;
	private Media media;
	private MediaPlayer mediaPlayer;
	
	   @FXML
	    private Label txtIdEs;

    @FXML
    private Label txtUser;

    @FXML
    private MediaView mediaView;

    @FXML
    private Circle circle1;

    @FXML
    private Circle circle2;

    @FXML
    private Circle circle3;

    @FXML
    private Circle circle4;
    
    @FXML
    private Line line4;

    @FXML
    private TextField txtGiorno;

    @FXML
    private TextField txtOra;

    @FXML
    private TextArea txtDescrizioneEs;

    @FXML
    private TextField txtRipetizioni;

    @FXML
    private TextField txtNote;	
    
    @FXML
    private Button btnEsSeguente;
    
    @FXML
    private Button btnAreaPersonale;
    
    @FXML
    private Label labelFine;
    
    @FXML
    void getAreaPersonale(ActionEvent event) throws IOException {
    	main.showDopoLogin(paziente);
    }

	  
	  @FXML
	    void doEsercizioSeguente(ActionEvent event) throws IOException {
		  
		  for(int i=0; i<esCorrenti.size();i++){
	    
			  if(!esCorrenti.get(i).isSvolto()){
				  this.txtIdEs.setText(esCorrenti.get(i).getIdEsercizio()+"");
	    			String result="";
	    			String x[]=esCorrenti.get(i).getDescrizione().split(" ");
	    			
	    			for(int j=0; j<x.length;j++){
	    				
	    				result+=x[j]+" ";	
	    				
	    				if(j%6==0 && j!=0)
	    					result+="\n";
	    			}
	    			System.out.println(result);
	    			this.txtDescrizioneEs.setText(result);
	    			
	    			media=new Media(esCorrenti.get(i).getVideoURL());
	    			mediaPlayer = new MediaPlayer(media);
	    			mediaPlayer.setMute(true);
	    			mediaPlayer.setAutoPlay(true);
	    			mediaView.setMediaPlayer(mediaPlayer);	
	    			esCorrenti.get(i).getCircle().setFill(Color.GREEN);
	    			esCorrenti.get(i).setSvolto(true);
	    			break;
	    		}
	    	if(i==esCorrenti.size()-1){
	    		this.labelFine.setVisible(true);
	    		this.btnAreaPersonale.setVisible(true);
	    		this.btnEsSeguente.setVisible(false);
	    		}
	    	
	    	}
	    	
	    }


	public void setModel(Model model, Main main, Paziente p, Seduta s) {
		this.model=model;
		this.main=main;
		this.txtUser.setText(p.getNome()+ " "+p.getCognome());
		this.paziente=p;
		this.seduta=s;		
		this.txtGiorno.setText(p.getNumeroSedute()+"");
		this.txtOra.setText(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute());
	
		if(LocalDateTime.now().isAfter(LocalDate.now().atTime(12,00)))
			esCorrenti=s.getEsPomeriggio();
		
		else
			esCorrenti=s.getEsMattino();
		
		String result="";
		String x[]=esCorrenti.get(0).getDescrizione().split(" ");
		
		for(int j=0; j<x.length;j++){
			
			result+=x[j]+" ";	
			
			if(j%6==0 && j!=0)
				result+="\n";
		}
		this.txtDescrizioneEs.setText(result);
		this.txtRipetizioni.setText(s.getRipetizioni());
		this.txtNote.setText(s.getNote());
		
		media=new Media(esCorrenti.get(0).getVideoURL());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setMute(true);
		mediaPlayer.setAutoPlay(true);
		mediaView.setMediaPlayer(mediaPlayer);	
		
		this.circle1.setFill(Color.GREEN);
		esCorrenti.get(1).setCircle(circle2);
		esCorrenti.get(2).setCircle(circle3);
	
		if(esCorrenti.size()==4)
			esCorrenti.get(3).setCircle(circle4);
		
		else if(esCorrenti.size()<4){
			this.circle4.setVisible(false);
			this.line4.setVisible(false);
		}
		this.txtIdEs.setText(esCorrenti.get(0).getIdEsercizio()+"");
		esCorrenti.get(0).setSvolto(true);
	}
	

}
