package essais;

import entites.*;

public class TestPersonne
{

	public static void main(String[] args)
	{
		Peronne a = new Peronne();
		a.nom = "Lycoris";
		a.prenom = "Sicarii";
		a.adresse = new AdressePostale();
		a.adresse.numero = 42;
		a.adresse.nomRue = "allée des Embrumes";
		a.adresse.codePostal = 99999;
		a.adresse.ville = "Londres";
		//a.adresse = new AdressePostale(42,"allée des Embrumes", 99999, "Londres");
		
		Peronne b = new Peronne();
		b.nom = "Nerine";
		b.prenom = "Peverell";
		b.adresse = new AdressePostale();
		b.adresse.numero = 24;
		b.adresse.nomRue = "rue du Lion";
		b.adresse.codePostal = 45210;
		b.adresse.ville = "Godric's Hollow";

	}

}
