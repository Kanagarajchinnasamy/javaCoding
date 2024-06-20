package java1.rahulshetty_questions;

public class Question5_PrintSumOfDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 155;
		int r,sum=0;
		while(n>0) {
		r=n%10;
		n=n/10;
		sum = sum+r;
		}
		System.out.println(sum);
	}

}
