package mathematical;

public class FindOddOrEven {

	public static void main(String[] args) {
		// Find the given number is odd or even
		FindOddOrEven obj = new FindOddOrEven();
		obj.findOddOrEven(4);
	}
	
	public void findOddOrEven(int num) {
		if(num%2==0) {
			System.out.println("Given num is even");
		}
		else {
			System.out.println("Given num is odd");
		}
	}

}
