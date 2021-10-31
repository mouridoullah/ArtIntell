package entreprise;

public class Ingenieur extends Employer{
	Categorie categorie;
	private boolean chefEquipe;

	public Ingenieur(String nom, String prenom, Categorie categorie) {
		super(nom, prenom);
		this.categorie = categorie;
		this.chefEquipe = false;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public boolean isChefEquipe() {
		return chefEquipe;
	}

	public void setChefEquipe() {
		this.chefEquipe = !chefEquipe;
	}

	
}
	

