package java1.practice_area;

public class ExtractOnlyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Testing2349";
		for (int i = 0; i <input.length(); i++) {
			if(input.charAt(i)>='0'&&input.charAt(i)<='9') {
				System.out.print(input.charAt(i));
			}
		}

	}

}
