package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille
{

	public static void main(String[] args)
	{
		//initialisation de la liste
		List<Ville> vector = new ArrayList<>();
		vector.add( new Ville("Nice", 343000) );
		vector.add( new Ville("Carcassonne", 47800) );
		vector.add( new Ville("Narbonne", 53400) );
		vector.add( new Ville("Lyon", 484000) );
		vector.add( new Ville("Foix", 9700) );
		vector.add( new Ville("Pau",77200) );
		vector.add( new Ville("Marseille", 850700) );
		vector.add( new Ville("Tarbes", 40600) );
		
		//ville la plus peuplé et suppression de la ville la moins peuplé
		int max = vector.get(0).getNbr();
		int min = vector.get(0).getNbr();
		String stMax = new String();
		Ville stMin = new Ville();
		for (Ville ville:vector)
		{
			if (max<ville.getNbr())
			{
				max = ville.getNbr();
				stMax = ville.getNom();
			}
			if (min>ville.getNbr())
			{
				min = ville.getNbr();
				stMin = ville;
			}
		}
		//System.out.println(stMax);
		vector.remove(stMin);
		
		//ville de plus de 100000 hab en MAJ
		for (Ville ville:vector)
		{
			if (ville.getNbr()>100000)
			{
				ville.upCase();
			}
		}
		
		//affichage
		for (Ville ville:vector)
		{
			ville.affiche();
		}
		
	}

}
