package arrays;

import java.util.Arrays;

public class Second_Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 52, 841, 632, 12, 854, 845, 452 };
		int min=a[0],secMin=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secMin=min;
				min=a[i];
			}
			else if(a[i]<secMin)
				secMin=a[i];
			
		}
		System.out.println("Minimum Number is:" + min);
		System.out.println("Second Minimum Number is:" + secMin);
		System.out.println(Arrays.toString(a));
	}

}
