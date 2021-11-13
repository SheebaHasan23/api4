package Java;

import java.util.LinkedHashSet;

public class T0_Remove_The_Duplicate_Character_In_GivenString {
	public static void main(String[] args) {
		String s="india";
		//Step1:Create set collection and add all char of given string into set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
	for(Character ch:set)
	{
		System.out.print(ch);
	}
}
}