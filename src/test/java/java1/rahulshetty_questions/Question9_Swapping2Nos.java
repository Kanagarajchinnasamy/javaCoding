package java1.rahulshetty_questions;

import java.util.Scanner;

public class Question9_Swapping2Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values for a & b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		swap2No(a, b);
		
		

	}
	
	public static void swap2No(int a, int b) {
		int temp;
		System.out.println("Before swap");
		System.out.println("Value of a: " +a);
		System.out.println("Value of b: " +b);
		temp =a;
		a=b;
		b=temp;
		System.out.println("After swap");
		System.out.println("Value of a: " +a);
		System.out.println("Value of b: " +b);
	}
}
