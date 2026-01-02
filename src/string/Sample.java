package string;

public class Sample {

	public static void main(String[] args) {
		String s="aaabbcccdeff";
		char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					count++;
				}
			}
			
				System.out.print(s1[i]+""+count+" ");
				i=i+count-1;
				
			
		}
	}

}
