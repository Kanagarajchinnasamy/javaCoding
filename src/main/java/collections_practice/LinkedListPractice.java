package collections_practice;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.addLast(30);
		list.addFirst(24);
		list.add(1,25);
		Collections.addAll(list, 99,100,101);
		System.out.println(list);

	}

}
