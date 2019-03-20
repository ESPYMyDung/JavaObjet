package listes;

public class Ville
{
	private String nom;
	private int nbHab;
	
	//constructeur
	public Ville(){}
	
	public Ville(String nom, int nbHab)
	{
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	
	//methode
	public void upCase()
	{
		String tmp = this.getNom();
		this.setNom(tmp.toUpperCase());
	}
	
	public void affiche()
	{
		System.out.println(this.getNom() + ", " + this.getNbr() + " hab.");
	}
	
	
	
	//setter
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public void setNbr(int nbHab)
	{
		this.nbHab = nbHab;
	}
	
	//getter
	public String getNom()
	{
		return nom;
	}
	
	public int getNbr()
	{
		return nbHab;
	}

}
