package java1.practice_area;

public class FindPrimeNumberOrNot {

	public static void main(String[] args) {
	System.out.println(findPrime(6)); 
		
	}
	
	public static boolean findPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}
}
