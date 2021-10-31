package entreprise;

public class Developpeur extends Employer{
	DomaineDEtude dEtude;

	public Developpeur(String nom, String prenom, DomaineDEtude dEtude) {
		super(nom, prenom);
		this.dEtude = dEtude;
	}

	public DomaineDEtude getdEtude() {
		return dEtude;
	}

	public void setdEtude(DomaineDEtude dEtude) {
		this.dEtude = dEtude;
	}

}
