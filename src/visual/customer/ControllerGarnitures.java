package visual.customer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;

public class ControllerGarnitures implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		displayGarniture();
	}
	
	public void displayGarniture() {
		
	}
	
	public void goToSauces() throws IOException { //Au lieu de "toAccueil", tu dois mettre to + [InterfaceDeDestination]
		Group acteur = new Group(); //Pas touche
		acteur.getChildren().add( //Pas touche
		FXMLLoader.load(getClass().getResource("010 Sauces.fxml")) //Ici, il faut changer le fichier fxml (la string en fait)
		); //Pas touche
		visual.ControllerClient.setScene(acteur, "SUBPAY - Sauces"); //Ici, il faut laisser "SUBPAY" et changer "Accueil" selon l'interface o�
																//tu vas. Ca permet de changer le titre de la fen�tre (et �a marche B)  )
	}
	public void goToRecettes() throws IOException { //Au lieu de "toAccueil", tu dois mettre to + [InterfaceDeDestination]
		Group acteur = new Group(); //Pas touche
		acteur.getChildren().add( //Pas touche
		FXMLLoader.load(getClass().getResource("008 Recettes.fxml")) //Ici, il faut changer le fichier fxml (la string en fait)
		); //Pas touche
		visual.ControllerClient.setScene(acteur, "SUBPAY - Recettes"); //Ici, il faut laisser "SUBPAY" et changer "Accueil" selon l'interface o�
																//tu vas. Ca permet de changer le titre de la fen�tre (et �a marche B)  )
	}
}
