package entreprise;

public enum Taille {
	Petit,
	Moyen,
	Grand;
	
	static Taille ranTaille() {
		return values()[(int) (Math.random() * values().length)];
	}
}
