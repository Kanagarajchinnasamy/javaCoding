package string_related;

import java.util.Arrays;

public class Program6_ConvertLowerToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "KANAGARAJ";
		char c[] = s.toCharArray();
		
		
		  for(int i=0;i<c.length;i++) 
		  { 
			  c[i]=(char) (c[i]+32);
		  }
		 
		
		System.out.println(c);

	}

}
