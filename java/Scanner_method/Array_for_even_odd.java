package scanner;

import java.util.Scanner;
public class Array_for_even_odd {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an size of an element:");
	int a=sc.nextInt();
	sc.nextLine();
	int arr[]=new int[a];
	System.out.println("Enter an number:");
	for(int i=0;i<a;i++) {
		arr[i]=sc.nextInt();
		
	}for(int i=0;i<a;i++) {
		if(arr[i]%2==0) {
			System.out.println("the number is even:");
		}
		else {
			System.out.println("the number is odd");
		}	
	
}
	sc.close();
}}
