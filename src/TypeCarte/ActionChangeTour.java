package TypeCarte;

import ClasseAbstraite.Carte;

public class ActionChangeTour extends Carte {

	public ActionChangeTour(int valeur, String couleur) {
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
