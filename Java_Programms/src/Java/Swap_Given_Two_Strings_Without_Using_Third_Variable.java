package Java;

public class Swap_Given_Two_Strings_Without_Using_Third_Variable {
public static void main(String[] args) {
	String s1="java";
	String s2="tyss";
	s1=s1+s2;
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
	
}
}
