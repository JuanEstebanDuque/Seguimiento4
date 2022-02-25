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

public class ControllerCambiarContraseña {
	
	@FXML
    private Button cerrarCajaBTN;

    @FXML
    private Button changePasswordBTN;

    @FXML
    private TextField passwordActualTF1;

    @FXML
    private TextField passwordActualTF2;

    @FXML
    private TextField passwordActualTF3;

    @FXML
    private TextField passwordActualTF4;

    @FXML
    private TextField passwordActualTF5;

    @FXML
    private TextField passwordActualTF6;

    @FXML
    private TextField passwordNewTF1;

    @FXML
    private TextField passwordNewTF2;

    @FXML
    private TextField passwordNewTF3;

    @FXML
    private TextField passwordNewTF4;

    @FXML
    private TextField passwordNewTF5;

    @FXML
    private TextField passwordNewTF6;

    @FXML
    void closeSafe(ActionEvent event) {

    }

    @FXML
    void newPassword(ActionEvent event) throws IOException {
    	boolean confirm = false;
    	boolean confirmNew = false;
    	String password = "000000";
    	String actualPassword = ""+passwordActualTF1.getText() + passwordActualTF2.getText() + passwordActualTF3.getText() + passwordActualTF4.getText() + passwordActualTF5.getText() +passwordActualTF6.getText();
    	confirm = actualPassword.equals(password);
    	if(confirm) {
    		String newPassword = ""+passwordNewTF1.getText()+passwordNewTF2.getText()+passwordNewTF3.getText()+passwordNewTF4.getText()+passwordNewTF5.getText()+passwordNewTF6.getText();
    		confirm = newPassword.equals(actualPassword);
    		if (confirmNew) {
    			System.out.println("La nueva contraseña es la misma que la anterior.");
    		} else {
				Stage stage = (Stage) this.changePasswordBTN.getScene().getWindow();
				stage.close();
				FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/CajaBloqueada.fxml"));
				loader.setController(new ControllerCajaBloqueada());
				Parent p = loader.load();
				Stage stage2 = new Stage();
				Scene scene = new Scene(p);
				stage2.setScene(scene);
				stage2.show();
    		}
    		
    	} else {
    		System.out.println("contraseña mala");
    	}
    }
    
}
