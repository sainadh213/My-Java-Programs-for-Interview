package string;

import java.util.Scanner;

public class Palindrome_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		if (input.equalsIgnoreCase(output)) {
			System.out.println("Given string is Plaindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}
	}

}
