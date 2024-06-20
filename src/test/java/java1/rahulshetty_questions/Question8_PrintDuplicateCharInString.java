package java1.rahulshetty_questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question8_PrintDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hehloww";
		char c[]= input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i!=c.length) {
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
		Set<Map.Entry<Character, Integer>>lmap = map.entrySet();
		boolean hasDuplicateChar = false;
		for(Map.Entry<Character, Integer> data: lmap) 
		{
			if(data.getValue()>1) {
				System.out.println("Duplicate chars are: " + data.getKey()+ " ");
				hasDuplicateChar = true;
			}
			
		}
		if(hasDuplicateChar==false) {
			System.out.println("No duplicate char");
		}

	}

}
