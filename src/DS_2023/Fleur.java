package DS_2023;

public class Fleur extends Plante{
	private String couleur;
	private int moisF;
	

	
	public Fleur(String nom, float hauteur, int age, double prix,String couleur, int moisF) {
		super(nom, hauteur, age, prix);
		this.couleur = couleur;
		this.moisF = moisF;
	}


	@Override
	public String toString() {
		return super.toString()+" couleur :" + couleur + " : moisF : " + moisF;
	}
	

	public String getCouleur() {
		return couleur;
	}

	public void desciption() {
		super.description();
	}
	
	public void fleurir() {
		if(moisF==4 || moisF==5 || moisF==6) {
			System.out.println("la fleur est en fleurs");
		}
		else {
			System.out.println("la fleur n'est pas en fleurs");			
		}
	}
	
}
