package pt;

import java.util.Scanner;

public class student_pass_mark {
	public static void main(String args[]) {
		int num1,grace;
		grace=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		num1=sc.nextInt();
		if(num1>=40) {
			System.out.print("total mark is=");
			System.out.println( num1+grace);
			System.out.println("pass");
			
		}
		else {
			System.out.print("total mark is=");
			System.out.println( num1+grace);
			System.out.println("better luck next time");
		}
		
}
	}
