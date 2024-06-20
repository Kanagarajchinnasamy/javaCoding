package java1.rahulshetty_questions_practice;

import java.util.Scanner;

public class Question1_ReverseAString {
	//Logic: use charAt, declare empty string and use reverse for loop
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		int size = input.length();
		String revString = "";
		for (int i=size-1;i>=0;i--) {
			
			revString = revString+input.charAt(i);
		}
		
		System.out.println(revString);
		
		
	}
}
