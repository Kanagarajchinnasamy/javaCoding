package java1.rahulshetty_questions;

public class Question2_1_Swap2Strings {

	//logic use temp variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "world";
		String c = "";
		
		System.out.println("Before swapping: ");
		System.out.println("Value of a is: " +a);
		System.out.println("Value of a is: " +b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping: ");
		System.out.println("Value of a is: " +a);
		System.out.println("Value of a is: " +b);
		System.out.println(a);
		System.out.println(b);

	}

}
