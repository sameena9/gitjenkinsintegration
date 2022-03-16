
public class Maximum {

	public static void main(String[] args) {
		
		
		int a[]=new int[3];
		a[0]=20;
		a[1]=30;
		a[2]=50;
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println("Maximum :"+max);

	}

}
