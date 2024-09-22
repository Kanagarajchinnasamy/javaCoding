package string_related;

public class Program3_PrintTotalWordsInString {
	
	public static void main(String[] args) {
		printTotalWords("Hi I m here");
		
	}
	
	public static void printTotalWords(String input) {
		
		int count=1;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' '&& input.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}

