package string;

public class Each_Word_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My Name is sainadh";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			char[]ch=s1[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}

	}

}
