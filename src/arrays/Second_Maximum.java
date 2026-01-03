package arrays;

import java.util.Arrays;

public class Second_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 52, 841, 632, 12, 854, 81, 452 };
		int max = a[0], secMax = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				secMax = max;
				max = a[i];
				
			} else if (a[i]>secMax) 
				
				secMax=a[i];
			
		}
		System.out.println("Maximum Number is:" + max);
		System.out.println("Second Maximum Number is:" + secMax);
		System.out.println(Arrays.toString(a));
	}

}
