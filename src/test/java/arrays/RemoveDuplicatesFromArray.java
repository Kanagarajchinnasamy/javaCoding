package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,5,2,5,3,2};
	//	Arrays.sort(num);
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<num.length;i++) {
			set.add(num[i]);
		}
		System.out.print(set+" ");
		

	}

}
