package TypeCarte;

import ClasseAbstraite.Carte;

public class ActionPiocheCouleur extends Carte{

	public ActionPiocheCouleur(int valeur, String couleur) {
		super(valeur, couleur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void effet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playIsPossible(Carte carte) {
		return false;
	}

}
