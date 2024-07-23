package mathematical;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPrimeNumber(6));
	}
	
	public static boolean findPrimeNumber(int num) {
		
		if(num<2) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

}
