package application;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class DemoController {
	ObservableList<String> providingOrganizationList=FXCollections.observableArrayList("Adhar Card","Driving License","Passport");
	
	@FXML
	private ChoiceBox providingOrganizationBox;
	
	@FXML
	private Button browseBtn;
	
	@FXML
	private TextField browseField;
	
	private static Stage primaryStage;
	@FXML
	private void initialize() {
		providingOrganizationBox.setItems(providingOrganizationList);
		providingOrganizationBox.setValue("Adhar Card");
		System.out.println(   providingOrganizationBox.getValue());
	}
	
	@FXML
	private void getInput() {
		System.out.println((String)providingOrganizationBox.getValue());
	}
	
	@FXML
	private void browse() {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		 directoryChooser.setInitialDirectory(new File("src"));

	        browseBtn = new Button("browse");
	        System.out.println("Hello world");
	        
	        File selectedDirectory = directoryChooser.showDialog(primaryStage);

       //     System.out.println(selectedDirectory.getAbsolutePath());
            String absPath=selectedDirectory.getAbsolutePath();
         //   System.out.println(absPath);
            browseField.setText(absPath);
	        
//	        browseBtn.setOnAction(e -> {
//	        	System.out.println("hello");
//	            
//	        });
	      //  VBox vBox = new VBox(browseBtn);
	}
}
