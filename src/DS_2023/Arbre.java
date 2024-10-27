package DS_2023;

public class Arbre extends Plante {
	private String type_Feuillage;
	private final int absorMoyenne=22;
	
	
	
	public Arbre(String nom, float hauteur, int age, double prix,String type_Feuillage) {
		super(nom, hauteur, age, prix);
		this.type_Feuillage = type_Feuillage;
	}
	@Override
	public String toString() {
		return  super.toString()+" : type_Feuillage :" + type_Feuillage;
	}
	public void description() {
		super.description();

	}
	
	public double absorptionCO2() {
		if(super.hauteur>50) {
			return absorMoyenne+3;
		}
		else {
			return absorMoyenne;
		}
	}
	public String getType_Feuillage() {
		return type_Feuillage;
	}

	
}
