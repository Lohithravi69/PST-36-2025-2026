package pt;

import java.util.Scanner;

public class unary_op {
	public static void main(String args[]) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		num1=sc.nextInt();
		
		
		if(num1==10) {
			
			 System.out.println("the numer is even and positive:"+ ++num1);	
		
		}
		else {
			System.out.println("the number is negative and odd:"+ num1);
		}
		sc.close();
	}
}
