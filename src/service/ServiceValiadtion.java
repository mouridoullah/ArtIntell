package service;

import entreprise.Developpeur;
import entreprise.Employer;
import entreprise.Equipe;
import entreprise.Ingenieur;

public class ServiceValiadtion {
	
	public static String validation(Equipe equipe, String resultat){
		
		int i = 0, j = 0;
		for (Employer employer : equipe.getListEmployer()) {
			if (employer.getClass() == Ingenieur.class) i++;
			else if(employer.getClass() == Developpeur.class) j++;
		}
		
		if(resultat == "1 Ingenieur, 3 Developpeurs et 2 semaine" && i >= 1 && j >= 3){
			return "Validé";
		}else if(resultat == "2 Ingenieur, 7 Developpeurs et 1 mois" && i >= 2 && j >= 7){
			return "Validé";
		}else if(resultat == "8 Ingenieur, 27 Developeurs et 8 mois" && i >= 8 && j >= 27){
			return "Validé";
		}else {
			return "rejeté";
		}
	}
}
