
package Java;

public class Reverse_The_String_Without_Using_LengthMethod_And_Variable {
	public static void main(String[] args) {
		String s="java";
		char[] a = s.toCharArray();
		int count=0;
		for(char ch:a)
		{
			count++;
		}
		String rev="";
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
	
	}
	
}
