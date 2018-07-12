public class Character
{
	public static void main(String[] args)
	{
		Character cob1=new Character();
		Character cob2=new Character();
		Character cob3=new Character();
		int difference=cob1.compareTo(cob2);

		if(difference==0)
		System.out.println(cob1+" is equal to "+cob2);

		else
		System.out.println(cob1+" is not equal to "+cob2);
		
		System.out.println("cob1 is"+( (cob2.equals(cob3) )? "equal" : "not equal" )+"to cob3");;
	}

	private int compareTo(Character cob2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}