package Java;

public class Reverse_The_String_By_Using_Third_Variable {
	public static void main(String[] args) {
		String s="java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
	}

}
