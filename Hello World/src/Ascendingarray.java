import java.util.Arrays;

public class Ascendingarray {
	
	public void ascending(int []a) {
		System.out.println("Before sort" +Arrays.toString(a));
		int temp = 0;
		for(int i=0; i<a.length;i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					//System.out.println(a[i]);
					}
				}
		}
		
		System.out.println("After sort" +Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		 
		Ascendingarray obj = new Ascendingarray();
		int a [] = {99,55,77};
		obj.ascending(a);
}
}