package string;

import java.util.Scanner;

public class PrintSpecificCharacters {

	public static void main(String[] args) {
		String s="sainadh";
		String s1="sainadh";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st input");
		int a = sc.nextInt();
		System.out.println("Enter 2nd input");
		int b = sc.nextInt();
		for(int i=a;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(int j=0;j<b-1;j++)
		{
			System.out.print(s1.charAt(j));
		}
		/*System.out.println(s.substring(a));
		System.out.println(s1.substring(0,b-1));*/

	}

}
