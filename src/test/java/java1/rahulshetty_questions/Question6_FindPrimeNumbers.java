package java1.rahulshetty_questions;

public class Question6_FindPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPrimeNumber(13));
	}
	
	public static boolean findPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for (int i = 2; i <num; i++) 
		{
			if(num%i ==0) {
				return false;
			}
		}
		return true;
		
		
	}

}
