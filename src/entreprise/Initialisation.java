package entreprise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import CRUD.Create;

public class Initialisation {
	private static List<Equipe> listEquipe;
	private static Map< Integer, Employer> ressourcesPersonnelle;

	public static void initialisation(int nombre_ingenieur, int nombre_personnel) {
		
		ressourcesPersonnelle = new HashMap<Integer, Employer>();
		for (int i = 1; i <= nombre_personnel; i = i + 1) {
			if(i <= nombre_ingenieur) Create.ServiceAdd(ressourcesPersonnelle, i, new Ingenieur("dd", "ff", Categorie.randCategorie()));
			else Create.ServiceAdd(ressourcesPersonnelle, i, new Developpeur("dd", "ff", Categorie.randCategorie()));
		}
		
		List<Employer> listEmployeePAD = new ArrayList<Employer>(); List<Projet> listProjetPAD = new ArrayList<Projet>(); 
		Equipe PAD = new Equipe(Categorie.Product_and_application_dévelopment, "Produit and Developpement", listEmployeePAD, listProjetPAD);
		List<Employer> listEmployeeDE = new ArrayList<Employer>(); List<Projet> listProjetDE = new ArrayList<Projet>(); 
		Equipe DE = new Equipe(Categorie.Data_Engineering, "Data Engineering", listEmployeeDE, listProjetDE);
		List<Employer> listEmployeeBI = new ArrayList<Employer>(); List<Projet> listProjetBI = new ArrayList<Projet>(); 
		Equipe BI = new Equipe(Categorie.Business_Intelligence, "Business Intelligence", listEmployeeBI, listProjetBI);
		List<Employer> listEmployeeDS = new ArrayList<Employer>(); List<Projet> listProjetDS = new ArrayList<Projet>(); 
		Equipe DS = new Equipe(Categorie.Data_Science, "Data Science", listEmployeeDS, listProjetDS);
		List<Employer> listEmployeeSM = new ArrayList<Employer>(); List<Projet> listProjetSM = new ArrayList<Projet>(); 
		Equipe SM = new Equipe(Categorie.Social_Media_Analytics, "Social Media Analytics", listEmployeeSM, listProjetSM);
		List<Employer> listEmployeeVA = new ArrayList<Employer>(); List<Projet> listProjetVA = new ArrayList<Projet>(); 
		Equipe VA = new Equipe(Categorie.Video_Analytics, "Video Analytics", listEmployeeVA, listProjetVA);
		List<Employer> listEmployeeCB = new ArrayList<Employer>(); List<Projet> listProjetCB = new ArrayList<Projet>(); 
		Equipe CB = new Equipe(Categorie.Chatbot, "Chatbot", listEmployeeCB, listProjetCB);
		List<Employer> listEmployeeFTC = new ArrayList<Employer>(); List<Projet> listProjetFTC = new ArrayList<Projet>(); 
		Equipe FTC = new Equipe(Categorie.Formation_et_transfert_de_connaissances, "Formation et Transfert de Connaissances", listEmployeeFTC, listProjetFTC);
		
		listEquipe = new ArrayList<Equipe>();
		listEquipe.add(PAD); listEquipe.add(DE); listEquipe.add(BI); listEquipe.add(DS);
		listEquipe.add(SM); listEquipe.add(VA); listEquipe.add(CB); listEquipe.add(FTC);
		
		
	    Employer someone;
		for (Map.Entry<Integer,Employer> entry : ressourcesPersonnelle.entrySet()) {
		    someone = entry.getValue();
		    if(someone.getClass() == Ingenieur.class) {
		    	if(((Ingenieur) someone).getCategorie() == Categorie.Product_and_application_dévelopment) PAD.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Data_Engineering) DE.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Business_Intelligence) BI.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Data_Science) DS.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Social_Media_Analytics) SM.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Video_Analytics) VA.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Chatbot) CB.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getCategorie() == Categorie.Formation_et_transfert_de_connaissances) FTC.getListEmployer().add(someone);
		    } else {
		    	if(((Developpeur) someone).getCategorie() == Categorie.Product_and_application_dévelopment) PAD.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Data_Engineering) DE.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Business_Intelligence) BI.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Data_Science) DS.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Social_Media_Analytics) SM.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Video_Analytics) VA.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Chatbot) CB.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getCategorie() == Categorie.Formation_et_transfert_de_connaissances) FTC.getListEmployer().add(someone);
		    }		
		
		}
	}

	public static List<Equipe> getListEquipe() {
		return listEquipe;
	}

	public static void setListEquipe(List<Equipe> listEquipe) {
		Initialisation.listEquipe = listEquipe;
	}
	
	

}
