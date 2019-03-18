package entites;

public class AdressePostale
{
	public int numero;
	public String nomRue;
	public int codePostal;
	public String ville;
	
	//constructeur
	public AdressePostale(){}
	
	
	public AdressePostale(int num, String rue, int codPos, String vil)
	{
		numero = num;
		nomRue = rue;
		codePostal = codPos;
		ville = vil;
	}

}
