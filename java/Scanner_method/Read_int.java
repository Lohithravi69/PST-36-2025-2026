package scanner;

import java.util.Scanner;

public class Read_int {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1=sc.nextInt();
		System.out.print("Enter number 2");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of two numbers:"+ sum);
		int diff=num1-num2;
		System.out.println("diff of two numbers:" + diff);
		int product=num1*num2;
		System.out.println("product of two numbers:" + product);
		int quotient=num1/num2;
		System.out.print("quotient of two numbers:" + quotient);
		
		
		sc.close();
}}
