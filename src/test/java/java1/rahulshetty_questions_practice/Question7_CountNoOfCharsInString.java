package java1.rahulshetty_questions_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.INPUT_STREAM;

public class Question7_CountNoOfCharsInString {

	//Logic:
	public static void main(String[] args) {
		String input = "a2b332ssu";
		char[]c = input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i!=c.length) {
			if(!map.containsKey(c[i])) {
			
				map.put(c[i],1);
			}
			else {
				int old = map.get(c[i]);
				map.put(c[i],old+1);
			}
			i++;
		}
	//	System.out.println(map);
		Set<Map.Entry<Character, Integer>>lmap = map.entrySet();
		for(Map.Entry<Character, Integer> data:lmap) {
			System.out.print(data.getKey()+ "-");
			System.out.print(data.getValue()+","+" ");
		}
	
	
	
	
	
	}

}
