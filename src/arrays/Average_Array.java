package arrays;

public class Average_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {521,45,5,886,452,4585,464,4125,526,99};
		int sum=0,avg;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Average of array is:"+avg);
	}

}
