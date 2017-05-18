package coo;

import coo.frame.Frame;
import coo.product.Management;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused") //Temporaire (j'aime pas les warnings!)
		Frame frame = new Frame("SubPay");
		Management.Importer("export.xml");
		//testExport();
	}
	//Ces actions sont effectu�s par le manager (indirectement via bouton)
	// c'est pas tr�s beau de faire comme �a
	// Ah Bon ?
	public static void testExport(){ 
		Management.addBread("Avoine", "C:\\...");
		Management.addBread("Mie", "C:\\...");
		Management.getBread("Mie").addAllergen("Levure");
		Management.addBread("Olive", "C:\\...");
		Management.addSauce("Andalouse", "C:\\...");
		Management.addPromotion("mercredi", 5.5, false);
		Management.addPromotion("auth", 10, true);
		Management.addRecipe("poulet", "mouais", 214, "C:\\...");
		Management.getPromotion("mercredi").addRecipe("poulet");
		Management.getPromotion("mercredi").addRecipe("kebab");
		Management.addGarnish("tomate", "titi");
		Management.addGarnish("basilic", "titi");
		Management.addGarnish("cheddar", "titi");
		Management.addDrink("cola cola", "toto");
		Management.addDessert("brownie", "truc marron");
		Management.Export("export.xml");
		Management.Importer("export.xml");
	}
}
