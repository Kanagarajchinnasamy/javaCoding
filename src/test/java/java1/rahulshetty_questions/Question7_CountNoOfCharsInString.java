package java1.rahulshetty_questions;

import java.util.LinkedHashMap;

import javax.print.DocFlavor.INPUT_STREAM;

public class Question7_CountNoOfCharsInString {

	//Logic:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count no of characters in a given string
		String input = "a2b3c4dd";
		char c[]= input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i<c.length) {
			if(!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}
			else {
				int oldVal = map.get(c[i]);
				map.put(c[i],oldVal+1);
			}
			i++;
		}
		System.out.println(map);
	}

}
