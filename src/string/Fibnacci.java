package string;

public class Fibnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1 = 0, f2 = 1, f3;
		System.out.print(f1+" "+f2+" ");
		for (int i = 1; i < 9; i++) {
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;

		}
	}

}
