package string;

public class Chracters_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sainadh";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ch)
					count++;
			}
			if(count>0)
				System.out.println(ch+" occures "+count+" times");
		}

	}

}
