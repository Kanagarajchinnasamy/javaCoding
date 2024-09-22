package string_related;

public class Program9_VerifyIfStringContainsOnlyIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "12345";
		char ch[] = i.toCharArray();
		boolean isInteger = false;
		for (int j = 0; j < ch.length; j++) {
			if(Character.isDigit(ch[j])) {
				isInteger = true;
			}
			else {
				isInteger = false;
				break;
			}
		}
		if(isInteger==true) {
			System.out.println("Only Integers are there");
		}
		else {
			System.out.println("char also there with integers");
		}

	}

}
