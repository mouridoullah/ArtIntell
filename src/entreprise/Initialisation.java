package entreprise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import CRUD.Create;

public class Initialisation {
	private static List<Equipe> listEquipe;
	private static Map< Integer, Employer> ressourcesPersonnelle;
 		
    public static String getFirstName() {
    	 String[] listPrenom = {"El Mamoun", "lydia", "Houssam","NASSIM","KOUSSAILA","GHILES","MOHAMMED","Farah","Yasmine",
				  "Kawtar","JULIEN", "MOHAMED RAMDANE","SARRA","MOUSSA","Amina","Imane","TOUFIK","AMIR","Khaoula",
				  "YESSIROU ARISTO","JULIEN","nassim","SYLVIE","Amine","Sofia", "JEFF","Sakhite","Abdellatif",
				  "Mohamed Amine","MAMADOU","NADJIB","SÉVERINE","MOHAMED-AMOKRANE","CHERIF AMANATOULHA","junyi",
				  " sidi mohamed hicham"};
       
        Integer random  = new Random().nextInt(listPrenom.length);
        return listPrenom[random];
    }

    public static String getLastName() {
    	 String[] listNom = {"AFFANE-AJI", "AGUINI", "ALI", "AMIROUCHE", "ARAB", "BABOU", "BOUKHARI", "BOURRAR",
				   "BOUSSAID", "CHMICHI", "DAURAT", "DEBIANE", "DOUGGUI", "EL HABAR", "FERHATI" ,"GHOUZALI", 
				   "GUENANE", "HAMMAD", "HASSOUNE", "HOUESSOU", "JACQUET", "KABACHE", "KHAMDARANIKORN", 
				   "LAIOU", "LANOUNI", "LIM", "MBOUP", "MISSOUMI", "MKHAIBOU", "NDIAYE", "RAHMANI", "SELAQUET", 
				   "SELMI", "SY", "WU", "ZEKRI" };

        Integer random = new Random().nextInt(listNom.length);
        return listNom[random];
    }
    
    public static String getRandNomEquipe() {
        String[] list = { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Raleigh", "Columbia", "Denver", 
                "Hartford", "Bismarck", "Pierre", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", 
                "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", 
                "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", 
                "Albany", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Nashville", "Austin", 
                "Salt Lake City", "Montpelier", "Richmond", "Charleston", "Olympia", "Madison", "Cheyenne" }; 
        Integer random = new Random().nextInt(list.length);
        return list[random];
    }

	
	public static void initialisation(int nombre_ingenieur, int nombre_personnel) {
		
		ressourcesPersonnelle = new HashMap<Integer, Employer>();
		for (int i = 1; i <= nombre_personnel; i = i + 1) {
			if(i <= nombre_ingenieur) Create.ServiceAdd(ressourcesPersonnelle, i, new Ingenieur(getLastName(), getFirstName(), DomaineDEtude.randCategorie()));
			else Create.ServiceAdd(ressourcesPersonnelle, i, new Developpeur(getLastName(), getFirstName(), DomaineDEtude.randCategorie()));
		}
		
		List<Employer> listEmployeePAD = new ArrayList<Employer>(); List<Projet> listProjetPAD = new ArrayList<Projet>(); 
		Equipe PAD = new Equipe(DomaineDEtude.Product_and_application_dévelopment, getRandNomEquipe(), listEmployeePAD, listProjetPAD);
		List<Employer> listEmployeeDE = new ArrayList<Employer>(); List<Projet> listProjetDE = new ArrayList<Projet>(); 
		Equipe DE = new Equipe(DomaineDEtude.Data_Engineering, getRandNomEquipe(), listEmployeeDE, listProjetDE);
		List<Employer> listEmployeeBI = new ArrayList<Employer>(); List<Projet> listProjetBI = new ArrayList<Projet>(); 
		Equipe BI = new Equipe(DomaineDEtude.Business_Intelligence, getRandNomEquipe(), listEmployeeBI, listProjetBI);
		List<Employer> listEmployeeDS = new ArrayList<Employer>(); List<Projet> listProjetDS = new ArrayList<Projet>(); 
		Equipe DS = new Equipe(DomaineDEtude.Data_Science, getRandNomEquipe(), listEmployeeDS, listProjetDS);
		List<Employer> listEmployeeSM = new ArrayList<Employer>(); List<Projet> listProjetSM = new ArrayList<Projet>(); 
		Equipe SM = new Equipe(DomaineDEtude.Social_Media_Analytics, getRandNomEquipe(), listEmployeeSM, listProjetSM);
		List<Employer> listEmployeeVA = new ArrayList<Employer>(); List<Projet> listProjetVA = new ArrayList<Projet>(); 
		Equipe VA = new Equipe(DomaineDEtude.Video_Analytics, getRandNomEquipe(), listEmployeeVA, listProjetVA);
		List<Employer> listEmployeeCB = new ArrayList<Employer>(); List<Projet> listProjetCB = new ArrayList<Projet>(); 
		Equipe CB = new Equipe(DomaineDEtude.Chatbot, getRandNomEquipe(), listEmployeeCB, listProjetCB);
		List<Employer> listEmployeeFTC = new ArrayList<Employer>(); List<Projet> listProjetFTC = new ArrayList<Projet>(); 
		Equipe FTC = new Equipe(DomaineDEtude.Formation_et_transfert_de_connaissances, getRandNomEquipe(), listEmployeeFTC, listProjetFTC);
		
		listEquipe = new ArrayList<Equipe>();
		listEquipe.add(PAD); listEquipe.add(DE); listEquipe.add(BI); listEquipe.add(DS);
		listEquipe.add(SM); listEquipe.add(VA); listEquipe.add(CB); listEquipe.add(FTC);
		
		
	    Employer someone;
		for (Map.Entry<Integer,Employer> entry : ressourcesPersonnelle.entrySet()) {
		    someone = entry.getValue();
		    if(someone.getClass() == Ingenieur.class) {
		    	if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Product_and_application_dévelopment) PAD.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Data_Engineering) DE.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Business_Intelligence) BI.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Data_Science) DS.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Social_Media_Analytics) SM.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Video_Analytics) VA.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Chatbot) CB.getListEmployer().add(someone);
		    	else if(((Ingenieur) someone).getdEtude() == DomaineDEtude.Formation_et_transfert_de_connaissances) FTC.getListEmployer().add(someone);
		    } else {
		    	if(((Developpeur) someone).getdEtude() == DomaineDEtude.Product_and_application_dévelopment) PAD.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Data_Engineering) DE.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Business_Intelligence) BI.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Data_Science) DS.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Social_Media_Analytics) SM.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Video_Analytics) VA.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Chatbot) CB.getListEmployer().add(someone);
		    	else if(((Developpeur) someone).getdEtude() == DomaineDEtude.Formation_et_transfert_de_connaissances) FTC.getListEmployer().add(someone);
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
