package Java;

public class Swap_Given_Two_Number_Without_Using_Third_Variable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);

int temp = a;
a=b;

b=temp;
System.out.println(a);
System.out.println(b);
}


		
}
