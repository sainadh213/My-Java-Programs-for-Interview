package string;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sainadh",s1="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			int a = s1.indexOf(ch);
			if(a==-1)
				s1=s1+ch;

	}
		System.out.println(s1);
	/*	for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.print(s.charAt(i)+"");
			}
		}*/
	}
}
