package entreprise;

import service.ServiceAffectation;
import service.ServicePlanDexecution;
import service.ServiceQualification;
import service.ServiceReceptionCommande;
import service.ServiceValiadtion;

public class DriveTest {

	public static void main(String[] args) {
		Initialisation.initialisation(4, 10);
		Client client = new Client("nom", "prenom");
		

		String resultat = ServiceReceptionCommande.ReceptionCommande(client);
		System.out.println(resultat);
		
		resultat = ServiceQualification.Analyse_Simple(client.getProjet());
		System.out.println(resultat);
		System.out.println("-----------------------------------------");
		
		Equipe equipe = ServiceAffectation.affecter(Initialisation.getListEquipe(), client.getProjet());
		System.out.println(resultat);
		System.out.println("-----------------------------------------");
		
		String resultat1 = ServicePlanDexecution.Analyse_Poussee(client.getProjet());
		System.out.println(resultat1);
		System.out.println("-----------------------------------------");
		
		if (equipe != null) {
			String resultat2 = ServiceValiadtion.validation(equipe, resultat1);
			System.out.println(resultat2);
			System.out.println("-----------------------------------------");
		}
		
		// Service de Reception
		// Service Qualification
		// Service Affectation
		// Service Plan d'execution
		// Service Validation
		// Service Suivie
	
	}
}
