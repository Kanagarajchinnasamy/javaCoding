package java1.rahulshetty_questions;

import java.util.Arrays;

public class Question16_Print2ndLargestNumberInArray {

	//Logic: Sort the array first.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to print the second largest number in a given array.
	int a[] = {1,4,3,3,6,8};
	int i=0;
	int max=a[0];
	int secMax=0;
	int j = a.length-1;
	while(i<j) {
		if(a[i+1]>max) {
			secMax = max;
			max=a[i+1];
			
		}
		else if(a[i+1]>secMax) {
			secMax=a[i+1];
		}
		i++;
	}
	System.out.println(secMax);
	}

}
