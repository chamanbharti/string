package immutable;

import java.util.Date;

public class ImmutableClass2 {
	
	   //Integer class is immutable as it does not provide any setter to change its content
	    private final Integer immutableField1;
	    
	    //String class is immutable as it also does not provide setter to change its content
	    private final String immutableField2;
	    
	    //Date class is mutable as it provide setters to change various date/time parts
	    
	    private final Date mutableField; 
	    
	  //Default private constructor will ensure no unplanned construction of class
	    private ImmutableClass2(Integer fld1, String fld2, Date date)
	    {
	        this.immutableField1 = fld1;
	        this.immutableField2 = fld2;
	        this.mutableField = new Date(date.getTime());
	    }
	    
	  //Factory method to store object creation logic in single place
	  public static ImmutableClass2 createNewInstance(Integer fld1,String fld2,Date date){
		  return new ImmutableClass2(fld1, fld2, date);
	  }
	//Provide no setter methods
	  
	    /**
	    * Integer class is immutable so we can return the instance variable as it is
	    * */
	    public Integer getImmutableField1() {
	        return immutableField1;
	    }
	 
	    /**
	    * String class is also immutable so we can return the instance variable as it is
	    * */
	    public String getImmutableField2() {
	        return immutableField2;
	    }
	 
	    /**
	    * Date class is mutable so we need a little care here.
	    * We should not return the reference of original instance variable.
	    * Instead a new Date object, with content copied to it, should be returned.
	    * */
	    public Date getMutableField() {
	        return new Date(mutableField.getTime());
	    }
	    
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return immutableField1+" - "+immutableField2+ " - "+mutableField;
	    }
	    
	    public static void main(String[] args) {
			
	    	ImmutableClass2 i = ImmutableClass2.createNewInstance(100, "Chaman", new Date());
	    	System.out.println(i);
	    	tryModification(i.getImmutableField1(),i.getImmutableField2(),i.getMutableField());
	    	System.out.println(i);
		}
	    
	    @SuppressWarnings("deprecation")
		private static void tryModification(Integer immutableField1,String immutableField2,Date mutableField){
	    	immutableField1=1000;
	    	immutableField2="name changed";
	    	mutableField.setDate(10);
	    }

}
