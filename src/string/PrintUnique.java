package string;

public class PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,6,6,9,10,10,10,12,12};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
