package entreprise;

import java.util.UUID;

public abstract class Employer {
	private String id_employee;
	private String nom;
	private String prenom;
	private boolean disponibilte;

	
	public Employer(String nom, String prenom) {
		super();
		this.id_employee = UUID.randomUUID().toString();
		this.nom = nom;
		this.prenom = prenom;
		this.disponibilte = Math.random() < 0.5;
		
	}

	public String getId_employee() {
		return id_employee;
	}

	public void setId_employee(String id_employee) {
		this.id_employee = id_employee;
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

	public boolean isDisponibilte() {
		return disponibilte;
	}

	public void setDisponibilte() {
		this.disponibilte = !disponibilte;
	}	
	
}
