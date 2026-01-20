package scanner;

import java.util.Scanner;

public class total_and_average {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1=sc.nextInt();
		System.out.print("Enter number 2:");
		int num2=sc.nextInt();
		System.out.print("Enter number 3:");
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		System.out.println("total of two numbers:"+ sum);
		double diff= (num1+num2+num3)/3;
		System.out.println("avg of two numbers:" + diff);
}}
