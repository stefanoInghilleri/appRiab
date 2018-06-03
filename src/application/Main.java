package application;
	

import java.io.IOException;

import application.controller.DatiPazienteController;
import application.controller.DopoLoginController;
import application.controller.LoginController;
import application.controller.ProtocolloWomacController;
import application.controller.PunteggioProtocolloController;
import application.controller.RiabController;
import application.controller.SezioneConsigliController;
import application.controller.SezioneEserciziController;
import application.controller.VideoConsiglioController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;
import model.Paziente;
import model.Seduta;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	

	private static Stage stage;
	private Model model;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Main.stage=primaryStage;
			 FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Main.class.getResource("interfaces\\Riab.fxml"));
	            BorderPane root = (BorderPane)loader.load();
	         
	            RiabController controller = loader.getController();
	            controller.setMain(this);
	           this.model=new Model();
	            
	            Scene scene = new Scene(root);
	            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	            primaryStage.setScene(scene);
	            primaryStage.centerOnScreen();
	            primaryStage.show();
	            } catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void showDatiPaziente()  throws IOException  {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\datiPaziente.fxml"));
		BorderPane root = (BorderPane)loader.load();
		DatiPazienteController controller= loader.getController();
	
		controller.setModel(this, model);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();	
	}

	public void showDopoLogin(Paziente paziente)  throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\dopoLogin.fxml"));
		BorderPane root = (BorderPane)loader.load();
		DopoLoginController controller= loader.getController();
		
		controller.setModel(model,this, paziente);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
	}

	public void showProtocolloWomac(Paziente p) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\protocolloWomac.fxml"));
		BorderPane root = (BorderPane)loader.load();
		ProtocolloWomacController controller= loader.getController();
		
		controller.setModel(model, this, p);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
	}

	public void showLoginForm() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\login.fxml"));
		BorderPane root = (BorderPane)loader.load();
		LoginController controller= loader.getController();
		
		controller.setModel(model, this);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
		
	}

	public void showSezioneEsercizi(Paziente p, Seduta s) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\SezioneEsercizi.fxml"));
		BorderPane root = (BorderPane)loader.load();
		SezioneEserciziController controller= loader.getController();
		
		controller.setModel(model, this, p, s);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
		
	}

	public void showSezioneConsigli(Paziente p, Seduta s) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\SezioneConsigliUtili.fxml"));
		BorderPane root = (BorderPane)loader.load();
		SezioneConsigliController controller= loader.getController();
		
		controller.setModel(model, this, p, s);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
		
	}

	public void showVideoConsiglio() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\VideoConsiglio.fxml"));
		BorderPane root = (BorderPane)loader.load();
		VideoConsiglioController controller= loader.getController();
		
		controller.setModel(model, this);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
		
	}

	public void showPunteggioWomac(Paziente paziente) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("interfaces\\punteggioProtocollo.fxml"));
		BorderPane root = (BorderPane)loader.load();
		PunteggioProtocolloController controller= loader.getController();
		
		controller.setModel(model, this, paziente);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
		
	}
}
