package arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 52, 4, 555,55544,24,456,12,745};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}*/
		//System.out.println(Arrays.toString(a));
	
	}

}
