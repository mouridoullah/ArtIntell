package entreprise;

import service.ServiceAffectation;
import service.ServicePlanDexecution;
import service.ServiceQualification;
import service.ServiceReceptionCommande;
import service.ServiceValiadtion;

public class DriveTest {

	public static void main(String[] args) {
		Initialisation.initialisation(4, 10);
		Client client = new Client(Initialisation.getLastName(), Initialisation.getFirstName());
		

		String resultat1 = ServiceReceptionCommande.ReceptionCommande(client);
		System.out.println(resultat1);
		
		System.out.print("-----------------------------------------");
		
		String resultat2 = ServiceQualification.Analyse_Simple(client.getProjet());
		System.out.println(resultat2);
		System.out.println("-----------------------------------------");

		if(resultat2 == "accepté") {
			Equipe equipe = ServiceAffectation.affecter(Initialisation.getListEquipe(), client.getProjet());
			System.out.println("-----------------------------------------");
			if(equipe != null) {
				String resultat3 = ServicePlanDexecution.Analyse_Poussee(client.getProjet());
				System.out.println(resultat3);
				System.out.println("-----------------------------------------");
				
				String resultat4 = ServiceValiadtion.validation(equipe, resultat3);
				System.out.println(resultat4);
				System.out.println("-----------------------------------------");
			}
		}

		
		// Service de Reception
		// Service Qualification
		// Service Affectation
		// Service Plan d'execution
		// Service Validation
		// Service Suivie
	
	}
}
