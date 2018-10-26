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
		 * 19 cartes rouges num�rot�es de 0 � 9 (le 0 en un seul exemplaire) ; 
		 * 19 cartes vertes num�rot�es de 0 � 9 (le 0 en un seul exemplaire) ; 
		 * 19 cartes jaunes num�rot�es de 0 � 9 (le 0 en un seul exemplaire) ; 
		 * 19 cartes bleues num�rot�es de 0 � 9 (le 0 en un seul exemplaire) ; 
		 * 8 cartes +2 (2 de chaque couleur : rouge, vert, jaune, bleu) ; 
		 * 8 cartes inversion (2 de chaque couleur : rouge, vert, jaune, bleu) ; 
		 * 8 cartes � passer / passe ton tour � (2 de chaque couleur : rouge, vert, jaune, bleu) ; 
		 * 4 cartes Joker ; 
		 * 4 cartes � +4 � ou � Super Joker �.
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
		
		




	}

	public Carte distribuer() {
		return null;
	}
}
