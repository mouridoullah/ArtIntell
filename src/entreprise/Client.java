package entreprise;

import java.util.UUID;

public class Client {
	
	private String id_Client;
	private String nom;
	private String prenom;
	private Projet projet;
	
	public Client(String nom, String prenom) {
		super();
		this.id_Client = UUID.randomUUID().toString();
		this.nom = nom;
		this.prenom = prenom;
		this.projet = new Projet(DomaineDEtude.randCategorie(), "Apollo", Taille.ranTaille());
	}

	public String getId_Client() {
		return id_Client;
	}

	public void setId_Client(String id_Client) {
		this.id_Client = id_Client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	
	
}
