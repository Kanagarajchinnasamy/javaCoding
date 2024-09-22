package string_related_hashmapBased;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program2_FindNonRepeatedChar {

	public static void main(String[] args) {
		//Question --> From a string, remove duplicate character
		
		String input = "Kngraj";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
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
		boolean hasDuplicate = false;
		for(Map.Entry<Character, Integer> data:hmap) {
			if(data.getValue()>1) {
				
				hasDuplicate = true;
			}
			else {
				System.out.print(data.getKey()+" ");
			}
		}
		System.out.println();
		if(!hasDuplicate) {
			System.out.println("No duplicates in string");
		}
		
	}
}



/*// TODO Auto-generated method stub
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

}*/