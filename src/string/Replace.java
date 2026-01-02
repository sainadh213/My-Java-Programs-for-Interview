package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sainadh@213";
		System.out.println(s.replace("s", "z"));
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println(s.replaceAll("[^a-z0-9]",""));
		System.out.println(s.concat("gmail.com"));

	}

}
