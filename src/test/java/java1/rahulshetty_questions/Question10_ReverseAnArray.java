package java1.rahulshetty_questions;

public class Question10_ReverseAnArray {

	//Logic: Use swap 2 numbers concept by including temp varaible
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+ " ");
			
		}
		int i=0,j=arr.length-1;
		while(i<j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
		System.out.println();
		for (int j2 = 0; j2 < arr.length; j2++) {
			
			System.out.print(arr[j2]+" ");
		}
		
	}

}
