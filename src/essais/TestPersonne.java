package essais;

import entites.*;

public class TestPersonne
{

	public static void main(String[] args)
	{
		/* TP1
		Peronne a = new Peronne();
		a.nom = "Lycoris";
		a.prenom = "Sicarii";
		a.adresse = new AdressePostale();
		a.adresse.numero = 42;
		a.adresse.nomRue = "allée des Embrumes";
		a.adresse.codePostal = 99999;
		a.adresse.ville = "Londres";
		
		Peronne b = new Peronne();
		b.nom = "Nerine";
		b.prenom = "Peverell";
		b.adresse = new AdressePostale();
		b.adresse.numero = 24;
		b.adresse.nomRue = "rue du Lion";
		b.adresse.codePostal = 45210;
		b.adresse.ville = "Godric's Hollow";
		*/

		Peronne a = new Peronne("Lycoris", "Sicarii");
		AdressePostale ou = new AdressePostale(24, "rue du Lion", 45210, "Godric's Hollow");
		Peronne b = new Peronne("Nerine", "Peverell", ou);
	}

}
