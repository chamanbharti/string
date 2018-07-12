class Intern{
public static void main(String args[])
{
  //String s=new String("Sachin Tendulkar");
  String s="Sachin Tendulkar";
  String s2=s.intern();
  
  System.out.println(s2);//Sachin
 
  
}

}