package string_related;

import java.awt.geom.Area;
import java.util.Arrays;

public class Program4_FindAnagram {

	public static void main(String[] args) {
		// Find if string is anagram or not
		
		String s1 = "I am Silent";
		String s2 = "I am Listen";
		s1 = s1.toLowerCase();
		s1=s1.replace(" ", "");
		s2=s2.toLowerCase();
		s2=s2.replace(" ", "");
		char[] input1=s1.toCharArray();
		char[] input2=s2.toCharArray();
		Arrays.sort(input1);
		Arrays.sort(input2);
		if(Arrays.equals(input1,input2)) {
			System.out.println("Both Are anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
		
		
		

	}

}
