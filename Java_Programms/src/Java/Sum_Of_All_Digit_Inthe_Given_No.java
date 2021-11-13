package Java;

import java.util.Scanner;

public class Sum_Of_All_Digit_Inthe_Given_No {
	public static void main(String[] args) {
	
		int n=123;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;	
		}
			System.out.println("sum of digit"+"="+sum);
	}

}
