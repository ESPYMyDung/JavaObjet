package maps;

import sets.Pays;
import java.util.*;

public class TestMapPays
{

	public static void main(String[] args)
	{
		Map<String, Pays> liste = new HashMap<>();
		liste.put("USA", new Pays("USA", 327167434, 55805.204) );
		liste.put("France", new Pays("France", 67795000, 38476.7) );
		liste.put("Allemagne", new Pays("Allemagne", 82979100, 47589.972) );
		liste.put("UK", new Pays("UK", 65105246, 43770.688) );
		liste.put("Italie", new Pays("Italie", 60483973, 29866) );
		liste.put("Japon", new Pays("Japon", 126168156, 39058.5) );
		liste.put("Chine", new Pays("Chine", 1417913092, 7989.72) );
		liste.put("Russie", new Pays("Russie", 146880400, 11099.20) );
		liste.put("Inde", new Pays("Inde", 1296834042, 1626.982) );
		
		for (String nom:liste.keySet())
		{
			System.out.println(nom);
		}
		
		for (Pays pays:liste.values())
		{
			System.out.println(pays);
		}
		
		int hab = liste.get("USA").getNbr(); //cas non general
		String sortie = new String();
		for (String nom:liste.keySet())
		{
			if (hab>liste.get(nom).getNbr())
			{
				hab = liste.get(nom).getNbr();
				sortie = nom;
			}
		}
		liste.remove(sortie);
		
		
		Iterator<String> it = liste.keySet().iterator();
		while (it.hasNext())
		{
			String elem = (String) it.next();
			System.out.println(elem);
		}
		
		
	}

}


/*Scanner entreeUtilisateur = new Scanner(System.in);
int choix = 0;

while (choix!=99)
{
	//menu application
	System.out.println("**** Debut application ****");
	System.out.println("1. Afficher les informations d'un pays");
	System.out.println("2. Supprimer un pays");
	System.out.println("3 Afficher la liste des pays");
	System.out.println("99. Quitter");
	
	//entree utilisateur
	choix = entreeUtilisateur.nextInt();
	entreeUtilisateur.nextLine();	
	
	switch(choix)
	{
	case(1): //va afficher les infi du pays choisi
		System.out.println("Choisir un pays");
		
		Pays pays = liste.get(entreeUtilisateur.nextLine());
		System.out.println(pays + ", PIB : " + pays.calcPIB());

		break;
		
	case(2): //va suprimmer le pays choisi
		System.out.println("Choisir un pays");
	
		liste.remove(entreeUtilisateur.nextLine());

		break;
		
	case(3): //va afficher le contenu de la liste
		Iterator<String> it = liste.keySet().iterator();
		while (it.hasNext())
		{
			String elem = (String) it.next();
			System.out.println(elem);
		}
		break;

	}
}

entreeUtilisateur.close();*/