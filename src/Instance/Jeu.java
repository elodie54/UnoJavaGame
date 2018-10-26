package Instance;

import java.util.List;

import ClasseAbstraite.Carte;

public class Jeu {
	private static final Jeu INSTANCE = new Jeu();
	private List<Carte> carteDisponible;

	public static Jeu getInstance() {
		return INSTANCE;
	}

	private Jeu() {
		/*
		 * 19 cartes rouges numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 19 cartes
		 * vertes numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 19 cartes jaunes
		 * numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 19 cartes bleues
		 * numérotées de 0 à 9 (le 0 en un seul exemplaire) ; 8 cartes +2 (2 de chaque
		 * couleur : rouge, vert, jaune, bleu) ; 8 cartes inversion (2 de chaque couleur
		 * : rouge, vert, jaune, bleu) ; 8 cartes « passer / passe ton tour » (2 de
		 * chaque couleur : rouge, vert, jaune, bleu) ; 4 cartes Joker ; 4 cartes « +4 »
		 * ou « Super Joker ».
		 */
		
		for (int i = 0; i < 19; i++) {

		}

	}

	public Carte distribuer() {
		return null;
	}
}
