package java1.rahulshetty_questions_practice;

public class Question4_ArmstrongNumber {

	//Logic: use modulo to get last digit and use '/' to get remaining 2 digits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//153
		
		int num = 321;
		int temp = num;
		int rem;
		int sum=0;
		while(num>0) {
			rem = num%10; //3
			num=num/10; //15
			sum = sum+rem*rem*rem;
		}
		
		if(temp == sum) {
			System.out.println("Its a armstrong number");
		}
		else {
			System.err.println("Not a armstrong");
		}
	}

}
