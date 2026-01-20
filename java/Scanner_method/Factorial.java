package scanner;

import java.util.Scanner;

public class Factorial {
public static void main(String args[]) {
	long factorial=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1=sc.nextInt();
		if(num1==0) {
		System.out.println("the factorial num is 0 :"+num1);	
		}
		else {
		for(int i=1;i<=num1;i++) {
			 factorial *=i;
		} 
		System.out.println("Factoial number is:"+ factorial);	
		}
		sc.close();
}
}
