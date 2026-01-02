package basic_programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 323, rem;
		int actNum = num;
		int revNum = 0;
		while (num > 0) {
			rem = num % 10;
			num=num/10;
			revNum = revNum * 10 + rem;
			System.out.println(revNum);
		}
		if (actNum == revNum)
			System.out.println(actNum+" is palindrome number");
		else
			System.out.println(actNum+" is not a palindrome number");
	}

}
