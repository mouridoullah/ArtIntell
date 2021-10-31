package entreprise;

public enum Categorie {
	Product_and_application_dévelopment,
	Data_Engineering,
	Business_Intelligence,
	Data_Science,
	Social_Media_Analytics,
	Video_Analytics,
	Chatbot,
	Formation_et_transfert_de_connaissances;
	
	static Categorie randCategorie() {
		return values()[(int) (Math.random() * values().length)];
	}
}
