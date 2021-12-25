package application;
	
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	private static Stage primaryStage;
	private static AnchorPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("App");
		showMainView();
		
	}
	private void showMainView() throws IOException {
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(Main.class.getResource("Demo.fxml"));
		mainLayout=loader.load();//mainview =mainlayout
		Scene scene=new Scene(mainLayout,700,400);//setting stage
	
       
		primaryStage.setScene(scene);
		primaryStage.show();//display
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
