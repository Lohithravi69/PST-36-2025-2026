package Core;

import java.util.Scanner;

public class Prime_Num_Check {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		if(num<=1) {
			System.out.println("not prime");
			
		}
		boolean isprime=true;
		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0) {
				isprime=false;
			}
		}
		if(isprime) {
			System.out.println("the num is prime");
		}
		else {
			System.out.println("not prime");
			
		}
		scan.close();
	}
}
