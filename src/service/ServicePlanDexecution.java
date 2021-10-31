package service;

import entreprise.Projet;
import entreprise.Statut;

public class ServicePlanDexecution {

	public static String Analyse_Poussee(Projet projet) {
		projet.setStatut(Statut.phase_generation_de_plan);
		//System.out.println("Le projet : "+projet.getNom()+"\nID : "+projet.getId_projet()+"\nStatut : "+projet.getStatut());
		switch (projet.getTaille()) {
			case Petit:
				return "1 Ingenieur, 3 Developpeurs et 2 semaine";
			case Moyen:
				return "2 Ingenieur, 7 Developpeurs et 1 mois";
			case Grand:
				return "8 Ingenieur, 27 Developeurs et 8 mois";
			default:
				return "On a pas les ressources pour votre projet ";
		}
	}
}
