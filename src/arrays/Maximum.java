package arrays;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {52,841,632,12,854,845,452};
		int max=a[0];
		//System.out.println(a.length);
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum Number is:"+max);

	}

}
