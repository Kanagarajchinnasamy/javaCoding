package inheritance_practice;

public class Child extends Parent implements demo {
	
	//int c;

	 public void show() {
		//super.show();
		System.out.println("Child");
	}

	public static void main(String[] args) {
		Child p = new Child();
		p.show();
		System.out.println(p.c);
		System.out.println(c1+9);
	}

	public void speak() {
		// TODO Auto-generated method stub
		
	}
}
