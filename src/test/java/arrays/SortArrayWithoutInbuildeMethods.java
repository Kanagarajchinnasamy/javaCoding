package arrays;

public class SortArrayWithoutInbuildeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {20,10,30,40,25,40,60,15};
		int temp;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++) 
			{
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int k=0;k<num.length;k++) {
			System.out.print(num[k]+" ");
		}
		System.out.println(num[num.length-3]);
	}

}
