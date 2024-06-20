package java1.rahulshetty_questions;

import java.util.Arrays;

public class Question12_FindLongestConsecutiveOccurenceofIntegerinArray {

	//Question: Write a Java Program to find the longest consecutive occurrence of integers in a given array
	//Logic: Take one value,add it and compare with nearest value. If it matches, increase count and use math class
	//to get the max value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10};
		
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		int count = 0;
		int t=0;
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]+1 == arr[j+1]) {
				count++;
			}
			else {
				count =0;
			}
			t = Math.max(t, count+1);
			
		}
		 
		System.out.println(t);
		}
}
