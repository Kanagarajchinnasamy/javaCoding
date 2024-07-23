package java1.rahulshetty_questions_practice;

import java.util.Scanner;

public class Question1_ReverseAString {
	//Logic: use charAt, declare empty string and use reverse for loop
	public static void main(String args[]) {
		 reverseString("Shanuja");
		
		
	}
	public static void reverseString(String s) {
		String reverse = "";
		for (int i = s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
}
