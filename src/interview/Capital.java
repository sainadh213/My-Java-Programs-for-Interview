package interview;

public class Capital {
//This line added through GitHub
	public static void main(String[] args) {
		String name="my name is sainadh";
		String[] word = name.split(" ");
		for(int i=0;i<word.length;i++)
		{
		
			char[] each = word[i].toCharArray();
			for(int j=0;j<each.length;j++)
			{
				
				if(j==0)
				{
					char upperCase = Character.toUpperCase(each[j]);
					System.out.print(upperCase);
			}
				else
				{
					System.out.print(each[j]);
					}
				}
			System.out.print(" ");
		}

	}

}
