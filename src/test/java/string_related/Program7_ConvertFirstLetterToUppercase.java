package string_related;

public class Program7_ConvertFirstLetterToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "i am kanagaraj";
		char[] c = input.toCharArray();
		c[0]=(char) (c[0]-32);
		for(int i=0;i<input.length();i++) {
			if(c[i]==' ') {
				c[i+1]=(char) (c[i+1]-32);
			}
		}
		System.out.println(c);
		
	}

}
