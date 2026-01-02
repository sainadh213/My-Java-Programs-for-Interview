package string;

public class Large_Word {

	public static void main(String[] args) {
		String s = "Mymyyy Nanmeme Isiiss Ssiainadhd";
		String[] s1 = s.split(" ");
		String max = s1[0];

		for (int i = 0; i < s1.length; i++) {
			
			if (s1[i].length()> max.length()) {
				max = s1[i];
			}
		}
		System.out.println("Larger word is:" + max);
	}

}
