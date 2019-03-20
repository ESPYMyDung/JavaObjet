package sets;

import java.util.*;

public abstract class TestPays
{

	public static void main(String[] args)
	{
		Set<Pays> vector = new HashSet<>();
		vector.add( new Pays("USA", 327167434, 55805.204) );
		vector.add( new Pays("France", 67795000, 38476.7) );
		vector.add( new Pays("Allemagne", 82979100, 47589.972) );
		vector.add( new Pays("UK", 65105246, 43770.688) );
		vector.add( new Pays("Italie", 60483973, 29866) );
		vector.add( new Pays("Japon", 126168156, 39058.5) );
		vector.add( new Pays("Chine", 1417913092, 7989.72) );
		vector.add( new Pays("Russie", 146880400, 11099.20) );
		vector.add( new Pays("Inde", 1296834042, 1626.982) );
		
		//pays au PIB/hab plus grand
		double pib_hab = vector.iterator().next().getPibHab();
		String sortie = new String();
		for (Pays pays:vector)
		{
			if (pib_hab<pays.getPibHab())
			{
				pib_hab = pays.getPibHab();
				sortie = pays.getNom();
			}
		}
		System.out.println(sortie);
		
		//pays au PIb total le plus grand
		double max = vector.iterator().next().calcPIB();
		String sor = new String();
		for (Pays pays:vector)
		{
			if (max<pays.calcPIB())
			{
				max = pays.calcPIB();
				sor = pays.getNom();
			}
		}
		System.out.println(sor);
		
		//mettre le pays au PIb total le plus petit en MAJ
		double min = vector.iterator().next().calcPIB();
		Pays out = new Pays();
		for (Pays pays:vector)
		{
			if (min>pays.calcPIB())
			{
				min = pays.calcPIB();
				out = pays;
			}
		}
		String tmp = out.getNom().toUpperCase();
		out.setNom(tmp);
		
		for (Pays pays:vector)
		{
			pays.affiche();
		}
		
		//supprimer le pays au PIb total le plus petit
		vector.remove(out);
		
		System.out.println("Apres");
		
		//afficher les pays avec les nom, nbr hab et PIB total
		for (Pays pays:vector)
		{
			pays.affiche();
		}
		

	}

}
