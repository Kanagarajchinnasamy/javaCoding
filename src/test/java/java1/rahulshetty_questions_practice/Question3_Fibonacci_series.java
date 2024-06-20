package java1.rahulshetty_questions_practice;

public class Question3_Fibonacci_series {

	//Logic: swap the first & second value & add it
	public static void main(String[] args) {
	//	1,1,2,3,5,8,13
		int n=10;
		int f=0;
		int s=1;
		int third;
		
		for (int i = 1; i <=n; i++) {
			System.out.print(f + " ");
			third = f+s;
			f=s;
			s=third;
			
			
		}
		
	}

}
