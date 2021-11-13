
package Java;

import java.util.HashSet;

public class The_Number_Of_Occurence_Of_Each_Character_In_GivenString {
	public static void main(String[] args) {
		String s="india";
		//Step1:Create set collection and add all char of given string into set
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//step2: compare each char of set with all the char of given string
		for( Character ch:set)//read the char from set
		
		{
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//step3:print both char of set and count
			System.out.println(ch+"="+count);
			
		}
	}

}
