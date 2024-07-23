package java1.rahulshetty_questions;

public class Question4_ArmstrongNumber {

	//Logic: use modulo to get last digit and use '/' to get remaining 2 digits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Question4_ArmstrongNumber armstrongNumber = new Question4_ArmstrongNumber();
	armstrongNumber.findArmstrongNumber(371);
		
	}
	
	public void findArmstrongNumber(int num) {
		
		int temp =num;
		int rem,sum=0;
		while(num>0) {
		rem=num%10;
		num=num/10;
		sum=sum+rem*rem*rem;
		}
		if(temp == sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("No");
		}
	}

}
