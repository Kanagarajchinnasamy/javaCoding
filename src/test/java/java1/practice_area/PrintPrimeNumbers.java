package java1.practice_area;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
printPrime(125);
	}
	
	public static void printPrime(int num) {
		for(int i=2;i<num;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
				}
			}
			if(isPrime == true) {
				System.out.print(i + " ");
			}
		}
			
	}

}
