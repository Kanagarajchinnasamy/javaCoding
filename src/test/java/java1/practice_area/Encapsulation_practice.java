package java1.practice_area;

public class Encapsulation_practice {

	 private int a;
	private String name; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation_practice obj = new Encapsulation_practice();
		System.out.println(obj.a);
	}

	public int getA() {
		return a;
	}
	
	public void setA(int value) {
		this.a =value;
	}
	
	public void getName() {
		System.out.println(a);
	}
}
