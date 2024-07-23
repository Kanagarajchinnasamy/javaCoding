package mathematical;

public class PrintLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,22,4,6,14,6};
		int max = a[0];
		int i=0;
		while(i<a.length) {
			if(a[i]>max) {
				max=a[i];
			}
			i++;
		}
		System.out.println(max);
		
	}

}
