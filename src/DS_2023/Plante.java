package DS_2023;

public class Plante {
	protected String nom;
	protected float hauteur;
	protected int age;
	protected double prix;
	private  static int count=0;
	
	public Plante(String nom, float hauteur, int age, double prix) {
		this.nom = nom;
		this.hauteur = hauteur;
		this.age = age;
		this.prix = prix;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "Plante nom : " + nom + ": hauteur : " + hauteur + ": age : " + age + ": prix : " + prix + " dinars ";
	}
	
	public void description() {
		System.out.println("Plante #"+count++);
		System.out.println(this);
	}
	
	
	

}
