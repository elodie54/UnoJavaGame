package TypeCarte;

import ClasseAbstraite.Carte;

public class Chiffre extends Carte {

	public Chiffre(int valeur, String couleur) {
		super(valeur, couleur);
	}

	@Override
	public void effet() {
		
		
	}

	@Override
	public boolean playIsPossible(Carte carte) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
