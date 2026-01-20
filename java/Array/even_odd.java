package week2;

import java.util.Scanner;

public class even_odd {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the no elements:");
		 int a= scan.nextInt() ;
		 scan.nextLine();
		 int arr[]=new int[a];
		System.out.println("eneter number:");
		for(int i=0;i<a;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("even number");
		for(int i=0;i<a;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
			
		}}
		scan.close();

	}}
