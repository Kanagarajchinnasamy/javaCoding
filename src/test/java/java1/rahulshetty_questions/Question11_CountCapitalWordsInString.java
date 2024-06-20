package java1.rahulshetty_questions;

public class Question11_CountCapitalWordsInString {

	//Logic1: use for loop to iterate and use charAt and increment the counter variable value
	//Logic2: use Character class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "HellWorld";
		int count=0;
		/*
		 * for (int i = 0; i < input.length(); i++) { if(input.charAt(i)>='A'&&
		 * input.charAt(i)<='Z') { count++; } } System.out.println(count);
		 */
		for(int i=0;i<input.length()-1;i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
