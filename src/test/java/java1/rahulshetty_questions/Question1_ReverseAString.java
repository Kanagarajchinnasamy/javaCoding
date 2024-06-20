package java1.rahulshetty_questions;

import java.util.Scanner;

public class Question1_ReverseAString {
	//Logic: use charAt, declare empty string and use reverse for loop
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String output = sc.nextLine();
		
		reverseString(output);
		
		
	}
	public static void reverseString(String input) {
		String reverseString ="";
		int length = input.length();
		for(int i=length-1;i>=0;i--) {
			reverseString = reverseString+input.charAt(i);
		}
		System.out.println(input);
		System.out.println(reverseString);
		if(reverseString.equalsIgnoreCase(input)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("No");
		}
	}
	
}
