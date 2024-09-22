package string_related;

import java.util.ArrayList;

public class Program8_CountVowelsConsonants {

	public static void main(String[] args) {
		// count vowels, consonants and special chars
		
		String input = "Hi Kanagaraj*";
		input = input.toLowerCase();
		ArrayList<Character> vowList = new ArrayList<Character>();
		int vowels=0;
		int consonants=0;
		int special =0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch>='a' && ch<='z' ) 
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
					vowels++;
					vowList.add(input.charAt(i));
				}
				else {
					consonants++;
				}
			}
			else {
				special++;
			}
			
			
		}
		System.out.println(vowels);	
		System.out.println(consonants);	
		System.out.println(special);	
		System.out.println(vowList);

	}

}
