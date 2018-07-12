class StringIgnore{
public static void main(String args[])
{
  String s1="Sachin ";
  String s2="SAchin ";

  System.out.println(s1.equals(s2));//false
  System.out.println(s1.equalsIgnoreCase(s2));//true
  
}

}