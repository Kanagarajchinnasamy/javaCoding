package java1.rahulshetty_questions_practice;

import java.util.Arrays;

public class Question12_FindLongestConsecutiveOccurenceofIntegerinArray {

	//Question: Write a Java Program to find the longest consecutive occurrence of integers in a given array
	//Logic: Take one value,add it and compare with nearest value. If it matches, increase count and use math class
	//to get the max value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,6,2,4,5,6,7,3,4,5};
		int i=0;
		int j=a.length-1;
		int max=0;
		int count=0;
		while(i<j) {
			if(a[i]+1==a[i+1]) {
				count++;
			}
			else {
				count=0;
			}
			i++;
			max=Math.max(max, count+1);
		}
		System.out.println(max);
		}
}
