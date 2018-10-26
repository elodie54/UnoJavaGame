package ClasseAbstraite;

public abstract class Carte {
	private int valeur;
	private String couleur;
	
	public abstract void effet();
	public abstract boolean playIsPossible(Carte carte);
	
	public Carte(int valeur, String couleur) {
		super();
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
}
