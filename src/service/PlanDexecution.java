package service;

import entreprise.Projet;
import entreprise.Statut;

public class PlanDexecution {
	public static String genererPlan(Projet projet) {
		
		projet.setStatut(Statut.phase_generation_de_plan);
		
		return "";
	}
}
