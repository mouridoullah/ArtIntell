package entreprise;

public class Developpeur extends Employer{
	Categorie categorie;

	public Developpeur(String nom, String prenom, Categorie categorie) {
		super(nom, prenom);
		this.categorie = categorie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
}
