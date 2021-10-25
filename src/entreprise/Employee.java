package entreprise;

import java.util.UUID;

public abstract class Employee {
	String id_employee;
	String nom;
	String prenom;
	Boolean disponibilte;
	
	public Employee(String nom, String prenom) {
		super();
		this.id_employee = UUID.randomUUID().toString();;
		this.nom = nom;
		this.prenom = prenom;
		this.disponibilte = false;
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

	public Boolean getDisponibilte() {
		return disponibilte;
	}

	public void setDisponibilte(Boolean disponibilte) {
		this.disponibilte = disponibilte;
	}
	
	
	
}
