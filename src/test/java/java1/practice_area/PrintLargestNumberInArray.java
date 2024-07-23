package java1.practice_area;

public class PrintLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,22,4,6,24,6};
		int i=0;
		int max = a[0];
		while(i<a.length) {
			if(a[i]>max) {
				max=a[i];
			}
			i++;
		}
		System.out.println(max);
	}

}
