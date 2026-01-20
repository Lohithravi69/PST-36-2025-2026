package scanner;

import java.util.Scanner;

public class Num_is_positive_0_negative {
	public static void main(String args[]) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		num1=sc.nextInt();
		
		
		if( num1>0) {
			 System.out.println("the numer is positive:"+ num1);	
		
		}
		if (num1<0){
			System.out.println("the number is negative:"+ num1);
		
		}
		else {
			System.out.println("the number is 0:"+ num1);
			
		}
		sc.close();
	}
}
