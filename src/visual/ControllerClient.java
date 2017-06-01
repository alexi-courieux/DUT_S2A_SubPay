package visual;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerClient extends Application {
	
	public void switchScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                //getClass().getResource("iews/Page.fxml")
        );

        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
      //  Main.primaryStage.setScene(scene);
    }
    
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader();
    	
    	Parent acteur = (Parent) loader.load(getClass().getResource("customer/Page1.fxml"));
    	
    	Scene scene = new Scene(acteur, 1280.0, 720.0);
    	
    	stage.setTitle("SUBPAY-Accueil");
        stage.setScene(scene);
        stage.show();
    }
	
	/**Launch the client interface*/
    public static void initialize() {
    	launch();
    }
}
