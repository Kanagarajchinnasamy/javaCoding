package Important_questions;

public class PrintTotalWordsInString {

	//Logic:Method 1 -  use array to split and calculate count of array
	//		Method 2 -  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "I am a farmer son";
		/*
		 * String[] i = input.split(" "); System.out.println(i.length);
		 */
		int count = 1;
		for (int i = 0; i < input.length()-1; i++) {
			if(input.charAt(i)==' ' && input.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
