package scanner;

import java.util.Scanner;

public class val_of_circle {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter decimal number :");
		float a=sc.nextFloat();
		double pi=3.14;
		double b=pi*a*a;
		System.out.print("the circumstence of circle :"+b);
		sc.close();
		
}}
