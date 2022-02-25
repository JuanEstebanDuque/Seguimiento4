package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;

public class ControllerCajaBloqueada {
	
	@FXML
    private Button accessBTN;

    @FXML
    private TextField passwordTF1;

    @FXML
    private TextField passwordTF2;

    @FXML
    private TextField passwordTF3;

    @FXML
    private TextField passwordTF4;

    @FXML
    private TextField passwordTF5;

    @FXML
    private TextField passwordTF6;

    @FXML
    void access(ActionEvent event) throws IOException {
    	boolean confirm = false;
    	String password = "000000";
    	String actualPassword = ""+passwordTF1.getText() + passwordTF2.getText() + passwordTF3.getText() + passwordTF4.getText() + passwordTF5.getText() +passwordTF6.getText();
    	confirm = actualPassword.equals(password);
    	if(confirm) {
    		Stage stage = (Stage) this.accessBTN.getScene().getWindow();
            stage.close();
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/CajaFuerte.fxml"));
			loader.setController(new ControllerCajaFuerte());
			Parent p = loader.load();
			Stage stage2 = new Stage();
			Scene scene = new Scene(p);
			stage2.setScene(scene);
			stage2.show();
    	} else {
    		System.out.println("contraseña mala");
    	}
    }
}
