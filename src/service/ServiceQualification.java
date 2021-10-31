package service;

import entreprise.Projet;
import entreprise.Statut;

public class ServiceQualification {

public static String Analyse_Simple(Projet projet) {
		
		projet.setStatut(Statut.phase_analyse_sur_qualification);
		System.out.println("\nTaille : "+projet.getTaille()+
							"\nStatut : "+projet.getStatut());
		switch (projet.getdEtude()) {
			case Product_and_application_d�velopment:
				return "accept�";
			case Data_Engineering:
				return "accept�";
			case Business_Intelligence:
				return "accept�";
			case Data_Science:
				return "accept�";
			case Social_Media_Analytics:
				return "accept�";
			case Video_Analytics:
				return "accept�";
			case Chatbot:
				return "accept�";
			case Formation_et_transfert_de_connaissances:
				return "accept�";
			default:
				return "refus�, nous ne sommes pas qualifi�s pour votre projet";
			
		}
	}
}
