package coding.star_numberPatterns;

public class PrintNumber {

	public static void main(String[] args) {
		/*   1
		     1 2
		     1 2 3
		     1 2 3 4
		     1 2 3 4 5
		  
		 */
		printNumbers(5);
	}
	public static void printNumbers(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
