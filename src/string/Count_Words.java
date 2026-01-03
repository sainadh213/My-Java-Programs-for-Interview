package string;

public class Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "we    are  test engineers";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i+1)!=' ')
				count++;
		}

		System.out.println(count);

	}
}
