package pt;

import java.util.Scanner;

public class ternary_op {
	public static void main(String args[]) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		num1=sc.nextInt();	
		String result=(num1/2==1) ? "Even" : "odd" ;
			 System.out.println("the numer is :"+ result);	
			 System.out.println(4>>1);	
		
		sc.close();
	}
}
