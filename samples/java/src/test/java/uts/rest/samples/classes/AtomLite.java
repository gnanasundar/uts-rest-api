package uts.rest.samples.classes;
import com.fasterxml.jackson.annotation.*;

//ignorable properties are of customizable - this is just an example
@JsonIgnoreProperties({"classType","attributes","parents","children","definitions","relations"})

public class AtomLite {
	
	private String ui;
	private String name;
	private String termType;
	private String language;
	private boolean suppressible;
	private boolean obsolete;
	private String rootSource;
	private String concept;
	private String code;
	private String sourceConcept;
	private String sourceDescriptor;
	
	public String getUi() {
		
		return this.ui;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public String getTermType() {
		
		return this.termType;
	}
	
	public String getLanguage() {
		
		return this.language;
	}
	
	public String getConcept() {
		
		return this.concept;
	}
	
	public String getSourceConcept() {
		
		return this.sourceConcept;
	}
	
	public String getSourceDescriptor() {
		
		return this.sourceDescriptor;
	}
	
	
	public String getCode() {
		
		return this.code;
	}
	
	public boolean getObsolete() {
		
		return this.obsolete;
	}
	
    public boolean getSupressible() {
		
		return this.suppressible;
	}
    
    public String getRootSource() {
    	
    	return this.rootSource;
    }


    private void setUi(String ui) {
		
		this.ui = ui;
	}
	
	private void setTermType(String termType){
		
		this.termType = termType;
	}
	
	private void setName(String name) {
		
		this.name = name;
	}
	
	private void setLanguage (String language) {
		
		this.language = language;
	}

	
	private void setObsolete (boolean obsolete) {
		
		this.obsolete = obsolete;
	}
	
	private void setRootSource(String rootSource) {
		
		this.rootSource = rootSource;
	}
	
	private void setSuppressible (boolean suppressible) {
		
		this.suppressible = suppressible;
	}

}
