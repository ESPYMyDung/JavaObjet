package essais;

import entites.*;

public class TestAdressePostale
{

	public static void main(String[] args)
	{
		/* TP1
		AdressePostale maison = new AdressePostale();
		maison.numero = 7;
		maison.nomRue = "Rue de Saint Gaudens";
		maison.codePostal = 31100;
		maison.ville = "Toulouse";
		*/
		AdressePostale maison = new AdressePostale(7, "rue de Saint Gaudens", 31100, "Toulouse");
		
		/* TP1
		AdressePostale hotel = new AdressePostale();
		hotel.numero = 12;
		hotel.nomRue = "Rue de la Johardière";
		hotel.codePostal = 44800;
		hotel.ville = "Sait Herblain";
		*/
		AdressePostale hotel = new AdressePostale(12, "rue de la Johardière", 44800, "Saint Herblain");

	}

}
