package entreprise;


import java.util.UUID;
import java.util.List;

public class Equipe {
	
	String id_equipe;
	Domaine domaine;
	String nom;
	String id_chef;
	private List<Employee> listEmployee;
	private List<Projet> listProjet;
	
	public Equipe(Domaine domaine, String nom, List<Employee> listEmployee,
			List<Projet> listProjet) {
		super();
		this.id_equipe = UUID.randomUUID().toString();
		this.domaine = domaine;
		this.nom = nom;
		this.id_chef = UUID.randomUUID().toString();;
		this.listEmployee = listEmployee;
		this.listProjet = listProjet;
	}
	
	public Employee getRanEmploye() {
		int index = (int)(Math.random() * listEmployee.size());
		return listEmployee.get(index);			
	}

	public String getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
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

	public void setId_chef(String id_chef) {
		this.id_chef = id_chef;
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public List<Projet> getListProjet() {
		return listProjet;
	}

	public void setListProjet(List<Projet> listProjet) {
		this.listProjet = listProjet;
	}
	
}
