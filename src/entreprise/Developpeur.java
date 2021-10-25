package entreprise;

public class Developpeur extends Employee{
	Domaine domaine;

	public Developpeur(String nom, String prenom, Domaine domaine) {
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
