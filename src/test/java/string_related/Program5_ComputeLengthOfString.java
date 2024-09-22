package string_related;

public class Program5_ComputeLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Kanagaraj";
		input = input.concat("\0");
		char c[] = input.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]!='\0') {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
