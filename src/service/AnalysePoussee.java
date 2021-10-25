package service;

import entreprise.Equipe;
import entreprise.Projet;
import entreprise.Statut;

public class AnalysePoussee {
	public static String Analyse_Poussee(Equipe equipe, Projet projet) {
		projet.setStatut(Statut.phase_analyse_approfondie);
		System.out.println("Le projet : "+projet.getNom()+"\nID : "+projet.getId_projet()+"\nStatut : "+projet.getStatut());
		switch (projet.getTaille()) {
			case Petit:
				return "1 Ingenieur, 3 Developpeurs";
			case Moyen:
				return "2 Ingenieur, 7 Developpeurs";
			case Grand:
				return "8 Ingenieur, 27 Developeurs";
			default:
				return "On a pas les ressources pour votre projet ";
		}
	}
}
