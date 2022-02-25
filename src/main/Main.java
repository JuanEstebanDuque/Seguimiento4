package main;

import controller.ControllerCajaBloqueada;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/CajaBloqueada.fxml"));
		loader.setController(new ControllerCajaBloqueada());
		Parent p = loader.load();
		Stage stage = new Stage();
		Scene scene = new Scene(p);
		stage.setScene(scene);
		stage.show();
	}

}
