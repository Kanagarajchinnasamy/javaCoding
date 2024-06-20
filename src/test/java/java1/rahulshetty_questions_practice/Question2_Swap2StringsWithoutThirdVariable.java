package java1.rahulshetty_questions_practice;

public class Question2_Swap2StringsWithoutThirdVariable {
	//Logic: use concat and use substring
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap2Strings("Rajus", "shanu");
	}
	
	public static void swap2Strings(String a, String b) {
		
		System.out.println("Before swap: "+"value of a= "+a +" value of b= " +b);
		//HellWorld
		a=a+b;
		b= a.substring(0, a.length()-a.length());
		a=a.substring(b.length());
		System.out.println("After swap: "+"value of a= "+a +"value of b= " +b);
		
	}

}
