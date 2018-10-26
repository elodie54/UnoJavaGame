package TypeCarte;

import ClasseAbstraite.Carte;

public class ActionchangeTour extends Carte {

	public ActionchangeTour(int valeur, String couleur) {
		super(valeur, couleur);
	}

	@Override
	public void effet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playIsPossible(Carte carte) {
		// TODO Auto-generated method stub
		return false;
	}

}
