package string_related_hashmapBased;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program3_FirstNonRepeatedChar {

	public static void main(String[] args) {
		//Question --> From a string, remove duplicate character
		
		String input = "Kngraj";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char c[] = input.toCharArray();
		int i=0;
		while(i<input.length()) {
			if(!map.containsKey(c[i])) {
				map.put(c[i],1);
			}
			else {
				int newValue = map.get(c[i])+1;
				map.put(c[i], newValue);
			}
			i++;
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>>hmap = map.entrySet();
		boolean hasNonRepeatedChar=true;
		for(Map.Entry<Character, Integer> data:hmap) {
			if(data.getValue()>1) {
				System.out.println(data.getKey());
				System.exit(0);
			}
			else {
				hasNonRepeatedChar = false;
			}
		
	}
		if(hasNonRepeatedChar == false) {
			System.out.println("No character is repeated");
		}
}
}


