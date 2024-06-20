package java1.rahulshetty_questions;

public class Question3_Fibonacci_series {

	//Logic: swap the first & second value & add it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int first=0,second=1,third;
		//System.out.print(third);
		for (int i = 1; i <=num; i++) 
		{
			System.out.print(first + " ");
			third = first+second;
			//System.out.print(third);
			first=second;
			second=third;
		
		}
		
	}

}
