class Substring{
public static void main(String args[])
{
  String s="Sachin Tendulkar";
  
  
  System.out.println(s.substring(6));//Tendulkar
  System.out.println(s.substring(0,6));//Sachin
  System.out.println(s.toUpperCase());//Sachin
  System.out.println(s.toLowerCase());//Sachin
  System.out.println(s.trim());//Sachin
  System.out.println(s.startsWith("S"));//Sachin
  System.out.println(s.startsWith("n"));//Sachin
  System.out.println(s.endsWith("r"));//Sachin
  System.out.println(s.charAt(0));//S
  System.out.println(s.charAt(3));//h
  System.out.println(s.length());//Sachin
  
}

}