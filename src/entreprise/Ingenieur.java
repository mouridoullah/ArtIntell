package entreprise;

public class Ingenieur extends Employee{
	Domaine domaine;

	public Ingenieur(String nom, String prenom, Domaine domaine) {
		super(nom, prenom);
		this.domaine = domaine;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	
	
}
	
