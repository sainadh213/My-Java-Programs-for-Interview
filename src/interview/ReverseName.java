package interview;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="abc aabbcc aaabbbccc abcd abcdabcd  bcdabcda ccaabbdd";
		String s="";
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			int num = s.indexOf(ch);
			if(num==-1)
			{
				s=s+ch;
			}
			System.out.println(s);
		}
			
			
			
			
		/*for(int i=0;i<name.length();i++)
		{
			int count=0;
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
					count++;
			}
			if(count==1)
				System.out.println(name.charAt(i));
		}*/
		

	}

}
