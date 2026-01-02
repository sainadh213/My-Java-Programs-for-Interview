package string;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sainadh";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of string is:" + rev);
	}

}
