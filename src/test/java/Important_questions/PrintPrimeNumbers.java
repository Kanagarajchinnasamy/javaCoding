package Important_questions;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,3,5,7,9
		
		//2 loops & boolean
		
		for(int i =2;i<100;i++) 
		{
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) 
			{
				if(i%j==0) 
				{
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber) {
				System.out.print(i + " - ");
			}
			
		}

	}

}
