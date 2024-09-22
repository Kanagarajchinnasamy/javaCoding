package string_related;

public class Program11_Swap2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Hello";
		String b = "world";
		System.out.println(a);
		System.out.println(b);
		a=a.concat(b);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

	}

}
