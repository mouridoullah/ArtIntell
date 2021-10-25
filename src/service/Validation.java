package service;

import entreprise.Projet;
import entreprise.Statut;

public class Validation {
	public static String validationDuDirTech(Projet projet) {
		
		projet.setStatut(Statut.phase_de_validation);
		
		return "";
	}
}
