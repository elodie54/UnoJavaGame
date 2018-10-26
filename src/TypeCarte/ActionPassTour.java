package TypeCarte;

import ClasseAbstraite.Carte;

public class ActionPassTour extends Carte {

	public ActionPassTour(int valeur, String couleur) {
		super(valeur, couleur);
		// TODO Auto-generated constructor stub
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
