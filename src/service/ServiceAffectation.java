package service;

import java.util.List;

import entreprise.Employer;
import entreprise.Equipe;
import entreprise.Projet;
import entreprise.Statut;

public class ServiceAffectation {

	public static Equipe affecter(List<Equipe> listEquipes, Projet projet) {
		
		projet.setStatut(Statut.phase_d_affectation);
		//System.out.println("Le projet : "+projet.getNom()+"\nID : "+projet.getId_projet()+"\nStatut : "+projet.getStatut());
		for (Equipe equipe : listEquipes) {
			if(equipe.getdEtude() == projet.getdEtude()) {
				
				int i = 0;
				for (Employer employer : equipe.getListEmployer()) {
					if(employer.isDisponibilte()) i = i + 1;
				}
				
				if(i >= 4 ) {
					equipe.getListProjet().add(projet);
					projet.setId_equipe(equipe.getId_equipe());
					projet.setChef_projet(equipe.getRanEmploye());

					System.out.println("Le projet : "+projet.getNom()+
							"\nID : "+projet.getId_projet()+
							"\nEquipe : "+equipe.getId_equipe()+
							"\nID Chef de projet : "+projet.getChef_projet().getId_employer()+
							"\nNom Chef de projet : "+projet.getChef_projet().getPrenom()+" "+projet.getChef_projet().getNom()+
							"\nNom de l'Equipe : "+equipe.getNom());
				
					return equipe;
				}
			}
		}
		System.out.println("On a pas les ressources pour votre projet");
		return null;

	}
}
