package entreprise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArtIntell {
	
	// static Employee dir_tech;
	private static List<Equipe> listEquipe;
	
	// ressourcesHumaine fait office de base de donnée des employés
	private static Map< Integer, Employee> ressourcesHumaine;

	public static void initialisation(int nombre_ingenieur, int nombre_personnel) {
		
		ressourcesHumaine = new HashMap<Integer, Employee>();
		for (int i = 1; i <= nombre_personnel; i = i + 1) {
			if(i <= nombre_ingenieur) ressourcesHumaine.put(i, new Ingenieur("dd", "ff", Domaine.ranDomaine()));
			else ressourcesHumaine.put(i, new Developpeur("dd", "ff", Domaine.ranDomaine()));
		}
		
//		for (Map.Entry<Integer,Employee> entry : ressourcesHumaine.entrySet()) {
//		    Integer key = entry.getKey();
//		    Employee someone = entry.getValue();
//		    if(someone.getClass() == Ingenieur.class) System.out.println("id : " + key +" Ingenieur, Domaine : "+  ((Ingenieur) someone).getDomaine());
//		    else System.out.println("id : " + key +" Developpeur, Domaine : "+ ((Developpeur) someone).getDomaine());
//		}
		
		List<Employee> listEmployeePAD = new ArrayList<Employee>(); List<Projet> listProjetPAD = new ArrayList<Projet>(); 
		Equipe PAD = new Equipe(Domaine.Product_and_application_dévelopment, "Produit and Developpement", listEmployeePAD, listProjetPAD);
		List<Employee> listEmployeeDE = new ArrayList<Employee>(); List<Projet> listProjetDE = new ArrayList<Projet>(); 
		Equipe DE = new Equipe(Domaine.Data_Engineering, "Data Engineering", listEmployeeDE, listProjetDE);
		List<Employee> listEmployeeBI = new ArrayList<Employee>(); List<Projet> listProjetBI = new ArrayList<Projet>(); 
		Equipe BI = new Equipe(Domaine.Business_Intelligence, "Business Intelligence", listEmployeeBI, listProjetBI);
		List<Employee> listEmployeeDS = new ArrayList<Employee>(); List<Projet> listProjetDS = new ArrayList<Projet>(); 
		Equipe DS = new Equipe(Domaine.Data_Science, "Data Science", listEmployeeDS, listProjetDS);
		List<Employee> listEmployeeSM = new ArrayList<Employee>(); List<Projet> listProjetSM = new ArrayList<Projet>(); 
		Equipe SM = new Equipe(Domaine.Social_Media_Analytics, "Social Media Analytics", listEmployeeSM, listProjetSM);
		List<Employee> listEmployeeVA = new ArrayList<Employee>(); List<Projet> listProjetVA = new ArrayList<Projet>(); 
		Equipe VA = new Equipe(Domaine.Video_Analytics, "Video Analytics", listEmployeeVA, listProjetVA);
		List<Employee> listEmployeeCB = new ArrayList<Employee>(); List<Projet> listProjetCB = new ArrayList<Projet>(); 
		Equipe CB = new Equipe(Domaine.Chatbot, "Chatbot", listEmployeeCB, listProjetCB);
		List<Employee> listEmployeeFTC = new ArrayList<Employee>(); List<Projet> listProjetFTC = new ArrayList<Projet>(); 
		Equipe FTC = new Equipe(Domaine.Formation_et_transfert_de_connaissances, "Formation et Transfert de Connaissances", listEmployeeFTC, listProjetFTC);
		
		listEquipe = new ArrayList<Equipe>();
		listEquipe.add(PAD); listEquipe.add(DE); listEquipe.add(BI); listEquipe.add(DS);
		listEquipe.add(SM); listEquipe.add(VA); listEquipe.add(CB); listEquipe.add(FTC);
		
		
	    Employee someone;
		for (Map.Entry<Integer,Employee> entry : ressourcesHumaine.entrySet()) {
		    someone = entry.getValue();
		    if(someone.getClass() == Ingenieur.class) {
		    	if(((Ingenieur) someone).getDomaine() == Domaine.Product_and_application_dévelopment) PAD.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Data_Engineering) DE.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Business_Intelligence) BI.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Data_Science) DS.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Social_Media_Analytics) SM.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Video_Analytics) VA.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Chatbot) CB.getListEmployee().add(someone);
		    	else if(((Ingenieur) someone).getDomaine() == Domaine.Formation_et_transfert_de_connaissances) FTC.getListEmployee().add(someone);
		    } else {
		    	if(((Developpeur) someone).getDomaine() == Domaine.Product_and_application_dévelopment) PAD.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Data_Engineering) DE.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Business_Intelligence) BI.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Data_Science) DS.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Social_Media_Analytics) SM.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Video_Analytics) VA.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Chatbot) CB.getListEmployee().add(someone);
		    	else if(((Developpeur) someone).getDomaine() == Domaine.Formation_et_transfert_de_connaissances) FTC.getListEmployee().add(someone);
		    }		
		
		}
		
//	    for (Equipe equipe : listEquipe) {
//			System.out.println("----- "+equipe.getDomaine()+" -----");
//			for (Employee employee : equipe.getListEmployee()) {
//			    if(employee.getClass() == Ingenieur.class) System.out.println(" id : " +employee.getId_employee()+" Ingenieur");
//			    else System.out.println("id : " +employee.getId_employee()+" Developpeur");
//			}
//		}
	}

	public static List<Equipe> getListEquipe() {
		return listEquipe;
	}

	public static void setListEquipe(List<Equipe> listEquipe) {
		ArtIntell.listEquipe = listEquipe;
	}
	
	

}
