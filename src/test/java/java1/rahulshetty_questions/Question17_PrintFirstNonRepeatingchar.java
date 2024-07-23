package java1.rahulshetty_questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question17_PrintFirstNonRepeatingchar {

	public static void main(String[] args) {
		//Write a Java Program to print the first non repeating character in a given String.
		
		String input = "GeeksForGeeks"; 
		char c[] = input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i!=c.length) {
			if(!map.containsKey(c[i])) {
				map.put(c[i],1);
				
			}
			else {
				int oldval = map.get(c[i]);
				map.put(c[i], oldval+1);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>>lmap = map.entrySet();
		for(Map.Entry<Character, Integer> data: lmap){
			if(data.getValue()==1) {
				System.out.println("First non repeating char: " + data.getKey());
				break;
			}
		}

	}

}
