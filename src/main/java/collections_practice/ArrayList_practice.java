package collections_practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(55);
		list.add(2,24);
		list.add(24);
		list.add(24);
		
		list.remove(3);
		list.clear();
		
		int k = list.lastIndexOf(24);
		System.out.println("INDEX" +k);
		boolean b = list.contains(24);
		System.out.println(b);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
