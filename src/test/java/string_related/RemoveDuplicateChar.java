package string_related;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Remove duplicate char in string
		
		String input = "I am Kanagaraj";
		char[] c = input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i<input.length()) {
			if(!map.containsKey(c[i])) {
				map.put(c[i],1);
				
			}
			else {
				int old = map.get(c[i]);
				map.put(c[i], old+1);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>>lmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:lmap) {
			if(data.getValue()==1) {
				System.out.print(data.getKey());
			}
		}

	}

}
