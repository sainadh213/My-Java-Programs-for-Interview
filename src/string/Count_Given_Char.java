package string;

public class Count_Given_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sainadh";
		char ch = 'a';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch)
				count++;

		}
		System.out.println(count);
		
	}
}