package entreprise;

import java.util.UUID;

public class Projet {
	
	String id_projet;
	Domaine domaine;
	String nom;
	String id_equipe;
	Employee chef_projet;
	Statut statut;
	Taille taille;		
	
	public Projet(Domaine domaine, String nom , Taille taille) {
		super();
		this.id_projet = UUID.randomUUID().toString();
		this.domaine = domaine;
		this.nom = nom;
		this.id_equipe = "";
		this.chef_projet = null;
		this.statut = null;
		this.taille = taille;
	}

	public String getId_projet() {
		return id_projet;
	}

	public void setId_projet(String id_projet) {
		this.id_projet = id_projet;
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

	public String getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	public Employee getChef_projet() {
		return chef_projet;
	}

	public void setChef_projet(Employee chef_projet) {
		this.chef_projet = chef_projet;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Taille getTaille() {
		return taille;
	}

	public void setTaille(Taille taille) {
		this.taille = taille;
	}

	
}
