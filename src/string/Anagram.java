package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silenu";

		s1 = s1.replaceAll(" ", "").toLowerCase();
		s2 = s2.replaceAll(" ", "").toLowerCase();
		if (s1.length() != s2.length()) {
			System.out.println("Given strings are not Anagram");
			return;
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		// Arrays.sort(ch1);
		// Arrays.sort(ch2);
		// Without using Arrays.sort()
		sorting(ch1);
		sorting(ch2);
		// without using Arrays.equals()
		boolean isAnagram = true;

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("Given strings are anagram");
		} else
			System.out.println("Given strings are not anagram");

		/*
		 * if (Arrays.equals(ch1, ch2)) {
		 * System.out.println("Given strings are anagram"); } else
		 * System.out.println("Given strings are not anagram");
		 */

	}

	public static void sorting(char[] array) {
		char temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

}
