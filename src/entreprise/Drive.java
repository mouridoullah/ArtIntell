package entreprise;

import service.AffecterUnProjet;
import service.AnalyseSimple;

public class Drive {

	public static void main(String[] args) {
		ArtIntell.initialisation(7, 20);
		
		Projet projet = new Projet(Domaine.ranDomaine(), "Apollo", Taille.ranTaille());
		String res = AnalyseSimple.Analyse_Simple(projet);
		System.out.println("Resultat de l'analyse : "+res);
		System.out.println("------------------------------------------------------");
		if(res == "accepté") {
			res = AffecterUnProjet.affecter(ArtIntell.getListEquipe(), projet);
			System.out.println(res);
		}
		/**
		 * Recevoire le projet
		 * Faire une analyse simple    				       => analyseur sur Domaine avec des switch
		 * affecter le projet a une equipe 				   => affecteur sur domaine avec des switch 
		 * Faire une analyse poussé 					   => suivant la taille du projet
		 * generer un plan d'execution avec des ressourecs => generer un plan avec du random
		 * validation du plan                              => suivant le ressource disponible
		 * chnager le statut du projet    				   => avec le service adequat
		 */
	}
}
