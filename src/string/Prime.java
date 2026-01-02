package string;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Given number is primenumber");
		}
		else
			System.out.println("Given number is not primenumber");

	}

}
