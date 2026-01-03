package basic_programs;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num =13,count = 0;
      for(int i=1;i<=num;i++)
      {
    	  if(num%i==0)
    		  count++;
    	  
      }
      if(count==2)
    	  System.out.println(num+" is Prime Number");
      else
    	  System.out.println(num+" is Not a Prime Number");
	}

}
