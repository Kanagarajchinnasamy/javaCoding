package java1.rahulshetty_questions;

public class Question2_Swap2StringsWithoutThirdVariable {
	//Logic: use concat and use substring
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "world"; //Helloworld
		
		System.out.println("Before swap:");
		System.out.println("Value of b:" +b);
		System.out.println("Value of a:" +a);
		
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		
		
		System.out.println("After swap:");
		System.out.println("Value of b:" +b);
		System.out.println("Value of a:" +a);
		
	}

}
