package DS_2023;

public class Pepinere {
		private int Max_Plantes=1000;
		private Plante[] inventaire;
		private int nombreDePlante=0;
		
		
		public Pepinere() {
			inventaire=new Plante[Max_Plantes];
		}
		
		public void ajoutPlante(Plante plante) {
			if(nombreDePlante<Max_Plantes) {
			inventaire[nombreDePlante]=plante;
			nombreDePlante+=1;
			}
		
		else {
			System.out.println("pas d'espace disponible dans le tableau");
		}
		
	}
		
		public void afficherInventaire() {
			for(int i=0;i<nombreDePlante;i++) {
				inventaire[i].description();
				if(inventaire[i] instanceof Fleur) {
					((Fleur)inventaire[i]).fleurir();
					}
				}	
		}
		
	public double totalAbsorptionTotaleCO2() {
		double k=0;
		for(int i=0;i<nombreDePlante;i++) {
			if(inventaire[i] instanceof Arbre ) {
				k+=((Arbre)inventaire[i]).absorptionCO2();
				}
			}
		return k;
		}
	
	
	
	public int compterArbresCaduques(){
		int s=0;
		for(int i=0;i<nombreDePlante;i++) {
			if(inventaire[i] instanceof Arbre && ((Arbre)inventaire[i]).getType_Feuillage().equalsIgnoreCase("Caduque")) {
				s+=1;
			}
	}
		return s;
	}
	

}


