package string_related_hashmapBased;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program4_FirstMaxOccuringChar {

	public static void main(String[] args) {
		//Question --> From a string, remove duplicate character
		
		String input = "Kanagaraj";
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
		
		char maxKey = ' ';
		int maxValue=0;
		for(Map.Entry<Character, Integer> data:hmap) {
			if(data.getValue()>maxValue) {
				maxKey = data.getKey();
				maxValue = data.getValue();
			}
			
}
		System.out.print(maxKey+ " ");
		System.out.println(maxValue);
}}


