package string_related;

public class Program10_ProveStringsareImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Hi";
		String y = "work";
		x.concat(y);
		System.out.println(x);

		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("world");
		sb.append(sb2);
		System.out.println(sb);
	}

}
