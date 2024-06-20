package java1.rahulshetty_questions_practice;

public class Question5_PrintSumOfDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 1440;
		 int rem,sum=0;
		 while(num>0) {
			 rem=num%10;
			 num=num/10;
			 sum= sum+rem;
		 }
		 System.out.println(sum);
	}

}
