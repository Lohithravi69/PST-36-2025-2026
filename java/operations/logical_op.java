package pt;

import java.util.Scanner;

public class logical_op {
	public static void main(String args[]) {
		boolean a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value a:");
		a=sc.nextBoolean();
		System.out.print("Enter value b:");
		b=sc.nextBoolean();
		if(a && b ==true) {
			System.out.println("true");			
		}
		else {
			System.out.println("false");
		}
		if(a || b ==true) {
			System.out.println("true");			
		}
		else {
			System.out.println("false");}
		if(a != b ==true) {
			System.out.println("true");			
		}
		else {
			System.out.println("false");
		}
		sc.close();
		}
}
