package Java;

public class Fibonacci_First_Five_Number {
	public static void main(String[] args) {
		int f1=0,f2=1;
		int n = 0;
		while(n>0)
		{
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		
	}

}
