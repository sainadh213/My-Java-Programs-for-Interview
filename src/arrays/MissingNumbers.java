package arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 9 };
		for (int i = 0; i <9; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;

				}
			}
			if(count==0)
			System.out.println(i);
		}

	}

}
