package entites;

public class Peronne
{
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	//construteur
	public Peronne(){};
	
	public Peronne(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Peronne(String nom, String prenom, AdressePostale adresse)
	{
		this(nom, prenom);
		this.adresse = adresse;
	}
}
