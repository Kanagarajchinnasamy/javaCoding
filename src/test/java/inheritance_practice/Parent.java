package inheritance_practice;

public  class Parent extends abstract_example {
	
	int c=10;
	//int var;

	 void show() {
		 System.out.println("Parent");
	 }
	
	public static void main(String[] args) {
		Parent c = new Parent();
		c.display1();
		c.display2();
		System.out.println(c.var);
	}

	@Override
	void display2() {
		System.out.println("display2");
		
	}

	
	

}
