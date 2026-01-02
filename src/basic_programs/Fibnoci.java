package basic_programs;

public class Fibnoci {

	public static void main(String[] args) {
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		for(int i=1;i<7;i++) {
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}

	}

}
