package listes;

import java.util.*;

public class TestListeString
{

	public static void main(String[] args)
	{
		List<String> vector = new ArrayList<>();
		vector.add("Nice"); vector.add("Carcassonne"); vector.add("Narbonne");
		vector.add("Lyon"); vector.add("Foix"); vector.add("Pau");
		vector.add("Marseille"); vector.add("Tarbes");
		
		//recherche du nom le plus grand
		int max = 0;
		String sortie = new String();
		for (String ville:vector)
		{
			if (max<ville.length())
			{
				max = ville.length();
				sortie = ville;
			}
		}
		//System.out.println(sortie);
		
		//mettre toutes les lettres en majuscules
		for (int i=0; i<vector.size(); i++)
		{
			String tmp = vector.get(i);
			vector.set(i, tmp.toUpperCase());
		}

		
		
		//supprimer les ville commencant par N	
		Iterator<String> it = vector.iterator();
		while (it.hasNext())
		{
			String elem = it.next();
			if(elem.charAt(0)=='N')
			{
				it.remove();
			}
		}
		
		//afficher la liste
		for (String ville:vector)
		{
			System.out.println(ville);
		}
	}

}
