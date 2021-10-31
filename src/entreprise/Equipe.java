package entreprise;

import java.util.List;
import java.util.UUID;

public class Equipe {
	private String id_equipe;
	private DomaineDEtude dEtude;
	private String nom;
	private static String id_chef;
	private static List<Employer> listEmployer;
	private static List<Projet> listProjet;
	
	public Equipe(DomaineDEtude dEtude, String nom, List<Employer> listEmployer, List<Projet> listProjet) {
		super();
		this.id_equipe = UUID.randomUUID().toString();
		this.dEtude = dEtude;
		this.nom = nom;
		Equipe.listEmployer = listEmployer;
		Equipe.listProjet = listProjet;
		
		setId_chef(listEmployer);
	}
	
	public Employer getRanEmploye() {
		int index = (int)(Math.random() * listEmployer.size());
		return listEmployer.get(index);			
	}
	
	public static void setId_chef(List<Employer> listEmployer) {
		for (Employer employer : listEmployer) {
			if(employer.getClass() == Ingenieur.class){
				id_chef = employer.getId_employer();
				break;
			}
		}
	}

	public String getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	public DomaineDEtude getdEtude() {
		return dEtude;
	}

	public void setdEtude(DomaineDEtude dEtude) {
		this.dEtude = dEtude;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static String getId_chef() {
		return id_chef;
	}

	public static void setId_chef(String id_chef) {
		Equipe.id_chef = id_chef;
	}

	public List<Employer> getListEmployer() {
		return listEmployer;
	}

	public static void setListEmployer(List<Employer> listEmployer) {
		Equipe.listEmployer = listEmployer;
	}

	public List<Projet> getListProjet() {
		return listProjet;
	}

	public static void setListProjet(List<Projet> listProjet) {
		Equipe.listProjet = listProjet;
	}

	
}
