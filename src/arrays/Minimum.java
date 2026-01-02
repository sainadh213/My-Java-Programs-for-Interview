package arrays;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {52,841,632,12,854,845,452};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum Number is:"+min);
	}

}
