package java1.rahulshetty_questions_practice;

public class Question11_CountCapitalWordsInString {

	//Logic1: use for loop to iterate and use charAt and increment the counter variable value
	//Logic2: use Character class
	public static void main(String[] args) {
		String input = "HelloworlD";
		int count=0;
		/*
		 * for(int i=0;i<input.length();i++) {
		 * if(Character.isUpperCase(input.charAt(i))) { count++; } }
		 */
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>='A'&& input.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);
		}

}
