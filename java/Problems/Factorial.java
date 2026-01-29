package Problems;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=sc.nextInt();
		int fac=1;
		for(int i=1;i<=a;i++) {
			fac*=i;
			
		}System.out.println("The factorial value is:"+fac);
		
	}
}
