package entreprise;

import java.util.List;
import java.util.UUID;

public class Equipe {
	private String id_equipe;
	private Categorie categorie;
	private String nom;
	private static String id_chef;
	private static List<Employer> listEmployer;
	private static List<Projet> listProjet;
	
	public Equipe(Categorie categorie, String nom, List<Employer> listEmployer, List<Projet> listProjet) {
		super();
		this.id_equipe = UUID.randomUUID().toString();
		this.categorie = categorie;
		this.nom = nom;
		Equipe.listEmployer = listEmployer;
		Equipe.listProjet = listProjet;
		
		setId_chef(listEmployer);
	}
	
	public Employer getRanEmploye() {
		int index = (int)(Math.random() * listEmployer.size());
		return listEmployer.get(index);			
	}

	public String getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getId_chef() {
		return id_chef;
	}

	public static void setId_chef(List<Employer> listEmployer) {
		for (Employer employer : listEmployer) {
			if(employer.getClass() == Ingenieur.class){
				id_chef = employer.getId_employee();
				break;
			}
		}
	}

	public List<Employer> getListEmployer() {
		return listEmployer;
	}

	public void setListEmployee(List<Employer> listEmployee) {
		Equipe.listEmployer = listEmployee;
	}

	public List<Projet> getListProjet() {
		return listProjet;
	}

	public void setListProjet(List<Projet> listProjet) {
		Equipe.listProjet = listProjet;
	}
	
	
}
