package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import main.Main;

public class ControllerCajaFuerte {
	
	@FXML
    private Button changePasswordBTN;

    @FXML
    private Button closeSafeBTN;

    @FXML
    private TextArea safeContentsTA;

    @FXML
    void closeSafe(ActionEvent event) throws IOException {
    	Stage stage = (Stage) this.closeSafeBTN.getScene().getWindow();
        stage.close();
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/CajaBloqueada.fxml"));
		loader.setController(new ControllerCajaBloqueada());
		Parent p = loader.load();
		Stage stage2 = new Stage();
		Scene scene = new Scene(p);
		stage2.setScene(scene);
		stage2.show();
    }

    @FXML
    void newPassword(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/CambiarContraseña.fxml"));
		loader.setController(new ControllerCambiarContraseña());
		Parent p = loader.load();
		Stage stage2 = new Stage();
		Scene scene = new Scene(p);
		stage2.setScene(scene);
		stage2.show();
    }
}
