package basic_programs;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153, rem;
		int actNum = num;
		int arm = 0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(actNum==arm)
			System.out.println(actNum+" is Armstrong Number");
		else
			System.out.println(actNum+" is not a Armstrong number");
	}

}
