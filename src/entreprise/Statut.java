package entreprise;

public enum Statut {
	phase_analyse_simple("PAS"),
	phase_d_affectation("PDA"), 
	phase_analyse_approfondie("PAA"),
	phase_generation_de_plan("PGP"),
	phase_de_validation("PDV"),
	refus("Refusé");
	
	private String abreviation ;  
	
	private Statut(String abreviation) {  
	    this.abreviation = abreviation ;  
	}  
	 
	public String getAbreviation() {  
	    return this.abreviation ;  
	}
	
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
    
}
