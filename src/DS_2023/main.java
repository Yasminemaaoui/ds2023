package DS_2023;

public class main {

	public static void main(String[] args) {
		System.out.println("           Pépinère GREEN HANDS");
		Pepinere pepinere=new Pepinere() ;
		Fleur rose=new Fleur(null,30.0f,12,15.99, "Rouge",2);
		Fleur tulipe=new Fleur("tulipe",20.0f,8,1299,"jaune",4);
		Arbre chene=new Arbre("chene",200,60,89.99,"Caduque");
		Arbre sapin=new Arbre("chene",200,60,89.99,"Caduque");
		rose.setNom("Rose");
		System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
		pepinere.ajoutPlante(rose);
		pepinere.ajoutPlante(tulipe);
		pepinere.ajoutPlante(chene);
		pepinere.ajoutPlante(sapin);
		pepinere.afficherInventaire();
		System.out.println("Nombre d'arbres Caduques dans la pépinère : "+pepinere.totalAbsorptionTotaleCO2());
		System.out.println("Nombre d'arbres Caduques dans la pépinère : "+pepinere.compterArbresCaduques());

	}

}
