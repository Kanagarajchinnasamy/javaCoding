package string_related;

public class Program1_ReverseAString {

	public static void main(String[] args) {
		System.out.println(reverseString("kanagaraj"));
		
		
	}

	public static String reverseString(String input) {
		String rev = "";
		for(int i =input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		return rev;
	}
}
