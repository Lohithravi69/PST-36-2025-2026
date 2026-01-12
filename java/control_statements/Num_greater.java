package pt;

import java.util.Scanner;

public class Num_greater {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=scan.nextInt();
		
		if(a>100) {
			System.out.println("num is greater");
		}
		else {
			System.out.println("num is lesser");
		}scan.close();
	}
	
}
