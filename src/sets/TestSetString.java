package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString
{

	public static void main(String[] args)
	{
		Set<String> vector = new HashSet<>();
		vector.add("USA"); vector.add("France");
		vector.add("Allemagne"); vector.add("UK");
		vector.add("Italie"); vector.add("Japon");
		vector.add("Chine"); vector.add("Russie");
		vector.add("Inde");
		
		//recherche du plus grand element sa supression 
		int max = vector.iterator().next().length();
		String sortie = new String();
		for (String pays:vector)
		{
			if (max<pays.length())
			{
				max = pays.length();
				sortie = pays;
			}
		}
		vector.remove(sortie);
		
		//nom de pays en MAj
		Set<String> vec = new HashSet<>();
		for (String pays:vector)
		{
			vec.add(pays.toUpperCase());
		}
		
		
		//affichage
		for (String pays:vec)
		{
			System.out.println(pays);
		}
		

	}

}
