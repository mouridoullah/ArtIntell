package service;

import entreprise.Projet;
import entreprise.Statut;

public class ServiceQualification {

public static String Analyse_Simple(Projet projet) {
		
		projet.setStatut(Statut.phase_analyse_simple);
		System.out.println("\nTaille : "+projet.getTaille()+
							"\nStatut : "+projet.getStatut());
		switch (projet.getCategorie()) {
			case Product_and_application_dévelopment:
				return "accepté";
			case Data_Engineering:
				return "accepté";
			case Business_Intelligence:
				return "accepté";
			case Data_Science:
				return "accepté";
			case Social_Media_Analytics:
				return "accepté";
			case Video_Analytics:
				return "accepté";
			case Chatbot:
				return "accepté";
			case Formation_et_transfert_de_connaissances:
				return "accepté";
			default:
				return "refusé";
			
		}
	}
}
