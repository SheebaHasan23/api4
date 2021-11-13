package Java;

public class Reverse_Given_String_Word {
public static void main(String[] args) {
	String s="welcome to tyss comp";
	String[] str=s.split(" ");
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]+" ");
	}
}
}
