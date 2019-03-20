package sets;

import java.util.*;

public class TestSetDouble
{

	public static void main(String[] args)
	{
		Set<Double> vector = new HashSet<>();
		vector.add(1.5); vector.add(8.25);
		vector.add(-7.32); vector.add(13.3);
		vector.add(-12.45); vector.add(48.5);
		vector.add(0.01);

		// affichage de tous les elements de la liste
		for (double entier:vector)
		{
			System.out.println(entier);
		}
				
		//recherche du plus grand element et supression du plus petit
		double max = vector.iterator().next();
		double min = vector.iterator().next();
		for (double entier:vector)
		{
			if (max<entier)
			{max = entier;}
			if (min>entier)
			{min = entier;}
		}
		//System.out.println(max);
		vector.remove(min);

		//recherche des elements negatif + tranform en positif
		Set<Double> vec = new HashSet<>(); //on est oblige de passer par un set intermediare sinon ça ne marche pas
		for (double entier:vector)
		{
			if(entier>0)
			{
				//vector.remove(entier);
				vec.add(entier);
			}
			else
			{
				vec.add(entier*(-1));
			}
		}

		System.out.println("Apres");

		for (double entier:vec)
		{
			System.out.println(entier);
		}
		
		
	}

}

