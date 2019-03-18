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
	
	//methode
	public void affichage()
	{
		String sortie = this.nom.toUpperCase() + " " +  this.prenom;
		System.out.println(sortie);
	}
	
	public void setNom(String nvNom)
	{
		this.nom = nvNom;
	}
	
	public void setPrenom(String nvPrenom)
	{
		this.prenom = nvPrenom;
	}
	
	public void setAdresse(AdressePostale nvAdresse)
	{
		this.adresse = nvAdresse;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public AdressePostale getAdresse(String nvNom)
	{
		return this.adresse;
	}
	
	
}
