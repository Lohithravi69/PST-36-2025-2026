package pt;

import java.util.Scanner;

public class even_odd {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=scan.nextInt();
		
		if(a%2==0) {
			System.out.println("num is even");
		}
		else {
			System.out.println("odd");
		}scan.close();
	}
	
}
