package string;

public class PrintDuplicates {
	public static void main(String args[])
	{
		String s="sainadhas";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
				
			}
			if(count==1)
				System.out.println(s.charAt(i));
		}
	}
}

/*for(int i=0;i<s.length();i++)
{
	for (int j=i+1;j<s.length();j++)
	{
		
		if(s.charAt(i)==s.charAt(j))
		
		{
			System.out.println(s.charAt(i));
			break;
		}
	}
}*/