package java1.rahulshetty_questions_practice;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,3,5,7,9
		
		//2 loops & boolean
		
		for(int i=2;i<10;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i+" ");
			}
		}
	}

}
