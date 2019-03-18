package essais;

import entites.*;

public class TestAdressePostale
{

	public static void main(String[] args)
	{
		AdressePostale maison = new AdressePostale();
		maison.numero = 7;
		maison.nomRue = "Rue de Saint Gaudens";
		maison.codePostal = 31100;
		maison.ville = "Toulouse";
		
		AdressePostale hotel = new AdressePostale();
		hotel.numero = 12;
		hotel.nomRue = "Rue de la Joharnière";
		hotel.codePostal = 44800;
		hotel.ville = "Sait Herblain";

	}

}
