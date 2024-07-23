package java1.rahulshetty_questions_practice;

public class Question2_Swap2StringsWithoutThirdVariable {
	//Logic: use concat and use substring
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap2Strings("Rajus", "shanu");
	}
	
	public static void swap2Strings(String a, String b) {
		
	a=a+b;
	//helloworld
	b = a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println(b);
	System.out.println(a);
		
	}

}
