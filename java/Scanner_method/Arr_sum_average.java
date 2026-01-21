package scanner;

import java.util.Scanner;

public class Arr_sum_average {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an size of an element:");
	int a=sc.nextInt();
	sc.nextLine();
	int arr[]=new int[a];
	System.out.println("Enter an number:");
	int sum=0;
	for(int i=0;i<a;i++) {
		
		arr[i]=sc.nextInt();
		 sum +=arr[i];
		 
	}
	double average =sum/a;
	System.out.println("The sum of numbers is:"+sum);
		 System.out.println("the average of two numbers is:"+average);
	
	
		
	
	
	
	sc.close();
}}

