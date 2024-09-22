package string_related;

public class Program2_Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//notes
		String input = "Hi I am word";
		//output = "word am I Hi";
		String[] input2 = input.split(" ");
		for(int i=input2.length-1;i>=0;i--) {
			System.out.print(input2[i]+" ");
		}
		

	}

}
