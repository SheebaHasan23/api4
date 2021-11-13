package Java;

public class Reverse_The_String_Without_Using_Third_Variable {
	public static void main(String[] args) {
		String s="india";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
