package pt;

import java.util.Scanner;

public class Grade_on_Marks {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=scan.nextInt();
		
		if(a>=90) {
			System.out.println("A-grade");
		}
		else if(a>=75 && a<=90) {
			System.out.println("B-grade");
		
		}
		else if(a>=50 && a<=75) {
			System.out.println("C-grade");
		}
		else {
			System.out.println("Fail");
		}
		scan.close();
		}
	}
	

