package listes;

import java.util.*;

public class TestListeInt
{

	public static void main(String[] args)
	{
		List<Integer> vector = new ArrayList<>();
		vector.add(-1); vector.add(5); vector.add(7);
		vector.add(3); vector.add(-2); vector.add(4);
		vector.add(8); vector.add(5);
		
		// affichage de tous les elements de la liste
		for (int entier:vector)
		{
			System.out.println(entier);
		}
		
		//recherche du plus grand element et du plus petit
		int max = vector.get(0);
		int min = vector.get(0);
		for (int entier:vector)
		{
			if (max<entier)
			{max = entier;}
			if (min>entier)
			{min = entier;}
		}
		//System.out.println(max);
		
		//supression du plus petit element
		Iterator<Integer> it = vector.iterator();
		while (it.hasNext())
		{
			int elem = it.next();
			if(elem==min)
			{
				it.remove();
			}
		}
		
		//recherche des elemnt negatif + tranform en positif
		for (int i=0; i<vector.size(); i++)
		{
			int tmp = vector.get(i);
			if(tmp<0)
			{vector.set(i, tmp*(-1));}
		}
		
		System.out.println("Apres");
		
		for (int entier:vector)
		{
			System.out.println(entier);
		}
	}

}
