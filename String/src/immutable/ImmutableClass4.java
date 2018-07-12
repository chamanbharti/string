package immutable;

import java.util.HashMap;

public class ImmutableClass4 {

	//required fields
    private int id;
    private String name;
     
    //optional fields
    private HashMap<String, String> properties;
    
    private String company;
     
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    @SuppressWarnings("unchecked")
	public HashMap<String,String> getProperties(){
    	//return cloned object to avoid changing it by the client applicaton
    	return (HashMap<String,String>) properties.clone();
    }
    
    public String getCompany(){
    	return company;
    }
    private ImmutableClass4(ImmutableBuilder builder){
    	this.id = builder.id;
    	this.name =builder.name;
    	this.properties = builder.properties;
    	this.company = builder.company;
    }
    //this is inner class
    //Builder class
    public static class ImmutableBuilder{
    	//required fields
        private int id;
        private String name;
         
        //optional fields
        private HashMap<String, String> properties;
        private String company;
        
        public ImmutableBuilder(int i,String nm) {
			this.id=i;
			this.name=nm;
		}
        
        @SuppressWarnings("unchecked")
		public ImmutableBuilder setProperties(HashMap<String,String> hm){
        	this.properties=(HashMap<String,String>)hm.clone();
        	return this;
        }
        
        public ImmutableBuilder setCompany(String comp){
        	this.company=comp;
        	return this;
        }
        
        public ImmutableClass4 build(){
        	return new ImmutableClass4(this);
        }
    }
    public static void main(String[] args) {
		
    	 // Getting immutable class only with required parameters
    	ImmutableClass4 obj = new ImmutableClass4.ImmutableBuilder(1, "Pankaj").build();
    	HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("Name", "Pankaj");
        hm.put("City", "San Jose");
        // Getting immutable class with optional parameters
        ImmutableClass4 obj2 = new ImmutableClass4.ImmutableBuilder(1, "Pankaj").setCompany("Apple").setProperties(hm).build();
       //Testing immutability
        HashMap<String,String> hm1=obj2.getProperties();
      //lets modify the Object passed as argument or get from the Object
        hm1.put("test", "test");
        hm.put("test", "test");
         
        //check that immutable class properties are not changed
        System.out.println(obj2.getProperties());
        
    	
	}
}
