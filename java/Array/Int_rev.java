package week2;


import java.util.Scanner;

public class Int_rev {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the no elements:");
		 int a= scan.nextInt() ;
		 scan.nextLine();
		 int arr[]=new int[a];
		System.out.print("eneter an elements:");
		for(int i=0;i<a;i++) {
			arr[i]=scan.nextInt();
			
		};
		System.out.println("Reversed int");
		for(int i=a-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		scan.close();
}}
