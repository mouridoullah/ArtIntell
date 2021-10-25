package entreprise;

public enum Domaine {
	Product_and_application_dévelopment("PAD"),
	Data_Engineering("DE"),
	Business_Intelligence("BI"),
	Data_Science("DS"),
	Social_Media_Analytics("SM"),
	Video_Analytics("VA"),
	Chatbot("CB"),
	Formation_et_transfert_de_connaissances("FTC");
		
	private String abreviation ;  
	
	private Domaine(String abreviation) {  
	    this.abreviation = abreviation ;  
	}  
	 
	public String getAbreviation() {  
	    return  this.abreviation ;  
	}
	
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
    
	static Domaine ranDomaine() {
		return values()[(int) (Math.random() * values().length)];
	}
}
