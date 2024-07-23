package mathematical;

public class FindOddNumbersInArray {

	public static void main(String[] args) {
		// Find the odd or even numbers in given array
		int num[]= {1,5,10,3,9};
findOddOrEven(num);
	}
	
	public static void findOddOrEven(int num[]) {
		for(int i=0;i<num.length;i++) {
			if(num[i]%3==0) {
				System.out.println("Odd numbers are: "+ num[i]);
			}
		}
	}

}
