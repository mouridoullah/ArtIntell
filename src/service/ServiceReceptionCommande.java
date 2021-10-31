package service;

import entreprise.Client;
import entreprise.Statut;


public class ServiceReceptionCommande {

	public static String ReceptionCommande(Client client){
		client.getProjet().setStatut(Statut.phase_reception);
		return "Bonjour "+client.getPrenom()+" "+client.getNom()+
				"\nLe projet : "+ client.getProjet().getNom()+  
				"\nID : "+client.getProjet().getId_projet()+" est en phase de : "+client.getProjet().getStatut();
	}
}
