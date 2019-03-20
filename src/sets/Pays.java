package sets;

public class Pays
{
	private String nom;
	private int nbHab;
	private double pibHab;
	
	//constructeur
	public Pays(){}
	
	public Pays(String nom, int nbHab, double pibHab)
	{
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}
	
	//methode
	public double calcPIB()
	{
		return this.nbHab*this.pibHab;
	}
	
	public void affiche()
	{
		String sortie = this.getNom() + ", " + this.getNbr() + " hab, PIB : " + this.calcPIB();
		System.out.println(sortie);
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
	
	public void setPibHab(int pibHab)
	{
		this.pibHab = pibHab;
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
	
	public double getPibHab()
	{
		return pibHab;
	}
	
}
