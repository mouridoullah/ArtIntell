package entreprise;

import java.util.UUID;

public class Projet {
	
	private String id_projet;
	private Categorie categorie;
	private String nom;
	private String id_equipe;
	private Employer chef_projet;
	private Statut statut;
	private Taille taille;		
	
	public Projet(Categorie categorie, String nom , Taille taille) {
		super();
		this.id_projet = UUID.randomUUID().toString();
		this.categorie = categorie;
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

	public String getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(String id_equipe) {
		this.id_equipe = id_equipe;
	}

	public Employer getChef_projet() {
		return chef_projet;
	}

	public void setChef_projet(Employer chef_projet) {
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
