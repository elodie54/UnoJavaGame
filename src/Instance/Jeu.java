package Instance;

import java.util.List;

import ClasseAbstraite.Carte;
import TypeCarte.ActionChangeCouleur;
import TypeCarte.ActionChangeTour;
import TypeCarte.ActionPassTour;
import TypeCarte.ActionPioche;
import TypeCarte.ActionPiocheCouleur;
import TypeCarte.Chiffre;

public class Jeu {
	private static final Jeu INSTANCE = new Jeu();
	private List<Carte> carteDisponible;

	public static Jeu getInstance() {
		return INSTANCE;
	}

	private Jeu() {
		/*
		 * 19 cartes rouges numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 
		 * 19 cartes vertes numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 
		 * 19 cartes jaunes numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 
		 * 19 cartes bleues numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 
		 * 8 cartes +2 (2 de chaque couleur : rouge, vert, jaune, bleu) ; 
		 * 8 cartes inversion (2 de chaque couleur : rouge, vert, jaune, bleu) ; 
		 * 8 cartes « passer / passe ton tour » (2 de chaque couleur : rouge, vert, jaune, bleu) ; 
		 * 4 cartes Joker ; 
		 * 4 cartes « +4 » ou « Super Joker ».
		 */
		
		
		// Rouge 
		carteDisponible.add(new Chiffre(0, "Rouge"));
		for (int i = 0; i < 18; i++) {
			carteDisponible.add(new Chiffre((i+1)%9, "Rouge"));
		}
		
		
		// Bleu 
		carteDisponible.add(new Chiffre(0, "Bleu"));
		for (int i = 0; i < 18; i++) {
			carteDisponible.add(new Chiffre((i+1)%9, "Bleu"));
		}
		
		// Jaune 
		carteDisponible.add(new Chiffre(0, "Jaune"));
		for (int i = 0; i < 18; i++) {
			carteDisponible.add(new Chiffre((i+1)%9, "Jaune"));
		}
		
		// Vert 
		carteDisponible.add(new Chiffre(0, "Vert"));
		for (int i = 0; i < 18; i++) {
			carteDisponible.add(new Chiffre((i+1)%9, "Vert"));
		}
		
		carteDisponible.add(new ActionPioche(0, "Bleu"));
		carteDisponible.add(new ActionPioche(0, "Bleu"));
		carteDisponible.add(new ActionPioche(0, "Vert"));
		carteDisponible.add(new ActionPioche(0, "Vert"));
		carteDisponible.add(new ActionPioche(0, "Rouge"));
		carteDisponible.add(new ActionPioche(0, "Rouge"));
		carteDisponible.add(new ActionPioche(0, "Jaune"));
		carteDisponible.add(new ActionPioche(0, "Jaune"));

		carteDisponible.add(new ActionChangeTour(0, "Bleu"));
		carteDisponible.add(new ActionChangeTour(0, "Bleu"));
		carteDisponible.add(new ActionChangeTour(0, "Vert"));
		carteDisponible.add(new ActionChangeTour(0, "Vert"));
		carteDisponible.add(new ActionChangeTour(0, "Rouge"));
		carteDisponible.add(new ActionChangeTour(0, "Rouge"));
		carteDisponible.add(new ActionChangeTour(0, "Jaune"));
		carteDisponible.add(new ActionChangeTour(0, "Jaune"));
		
		carteDisponible.add(new ActionPassTour(0, "Bleu"));
		carteDisponible.add(new ActionPassTour(0, "Bleu"));
		carteDisponible.add(new ActionPassTour(0, "Vert"));
		carteDisponible.add(new ActionPassTour(0, "Vert"));
		carteDisponible.add(new ActionPassTour(0, "Rouge"));
		carteDisponible.add(new ActionPassTour(0, "Rouge"));
		carteDisponible.add(new ActionPassTour(0, "Jaune"));
		carteDisponible.add(new ActionPassTour(0, "Jaune"));
		
		carteDisponible.add(new ActionChangeCouleur(0, "Noir"));
		carteDisponible.add(new ActionChangeCouleur(0, "Noir"));
		carteDisponible.add(new ActionChangeCouleur(0, "Noir"));
		carteDisponible.add(new ActionChangeCouleur(0, "Noir"));
		
		carteDisponible.add(new ActionPiocheCouleur(0, "Noir"));
		carteDisponible.add(new ActionPiocheCouleur(0, "Noir"));
		carteDisponible.add(new ActionPiocheCouleur(0, "Noir"));
		carteDisponible.add(new ActionPiocheCouleur(0, "Noir"));
	}

	public Carte distribuer() {
		return null;
	}
}
