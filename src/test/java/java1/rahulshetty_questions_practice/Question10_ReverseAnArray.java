package java1.rahulshetty_questions_practice;

public class Question10_ReverseAnArray {

	//Logic: Use swap 2 numbers concept by including temp varaible
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		reverseArray(a);
		
	}

	public static void reverseArray(int[] a) {
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}
}
