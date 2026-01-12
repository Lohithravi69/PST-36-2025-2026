package pt;

import java.util.Scanner;

public class Reverse_num {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int i=0;
	while(num!=0) {
		i=i*10+num%10;
		num/=10;
	}
	System.out.println( i);
	scan.close();
	}
}


