package java1.practice_area;

public class Constructor_practice {
	int n;
	String name;
	
	public Constructor_practice(int n, String name) {
		this.n = n;
		this.name=name;
		return;
	}
	
	public Constructor_practice(int n) {
		this.n = n;
	}
	
	public Constructor_practice(Constructor_practice obj) {
		this.n=obj.n;
		this.name = obj.name;
	}
	
	
	public static void main(String[] args) {
		
		Constructor_practice c = new Constructor_practice(5, "raj");
		Constructor_practice c1 = new Constructor_practice(50);
		Constructor_practice c3 = new Constructor_practice(c1);
	//	c1.getData();
		c.getData();
		c3.getData();
		
	}
	
	public void getData() {
		
		System.out.println(n);
		System.out.println(name);
	}
}
