package entreprise;

public class Ingenieur extends Developpeur{
	private boolean chefEquipe;

	public Ingenieur(String nom, String prenom, DomaineDEtude categorie) {
		super(nom, prenom, categorie);
		this.chefEquipe = false;
	}

	public boolean isChefEquipe() {
		return chefEquipe;
	}

	public void setChefEquipe(boolean chefEquipe) {
		this.chefEquipe = chefEquipe;
	}
	
}
	

