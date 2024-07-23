package string_related;

public class PrintTotalWordsInString {

	//Logic:Method 1 -  use array to split and calculate count of array
	//		Method 2 -  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		String input = "I am a farmer son";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' '&&input.charAt(i+1)!=' ') {
			count++;	
			}
		}
		System.out.println(count);
	}

}
