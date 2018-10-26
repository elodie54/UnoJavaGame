package ClasseAbstraite;

public abstract class Carte {
	private int valeur;
	private String couleur;
	
	public abstract void effet();
	public abstract boolean playIsPossible(Carte carte);
	
	
}
