package java1.rahulshetty_questions;

public class Question4_ArmstrongNumber {

	//Logic: use modulo to get last digit and use '/' to get remaining 2 digits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Question4_ArmstrongNumber armstrongNumber = new Question4_ArmstrongNumber();
	armstrongNumber.findArmstrongNumber(371);
		
	}
	
	public void findArmstrongNumber(int n) {
		
		int temp =n;
		int r,sum=0;
		while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
		}
		if(temp == sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("No");
		}
	}

}
