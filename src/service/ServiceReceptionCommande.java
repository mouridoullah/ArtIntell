package service;

import entreprise.Client;


public class ServiceReceptionCommande {

	public static String ReceptionCommande(Client client){
		
		return "Bonjour Mr "+client.getNom()+
				"\nLe projet : "+ client.getProjet().getNom()+  "\nID : "+
				client.getProjet().getId_projet()+"\na bien été reçu"+
				"\n------------------------Terminé----------------------";
	}
}
