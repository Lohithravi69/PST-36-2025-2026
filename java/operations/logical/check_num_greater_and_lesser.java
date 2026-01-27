package pt;

import java.util.Scanner;

public class check_num_greater_and_lesser {
	public static void main(String args[]) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number between 10 and 50:");
		num1=sc.nextInt();
		
		
		if(num1>10 && num1<50) {
			 System.out.println("the numer is correct:"+ num1);	
		
		}
		else {
			System.out.println("Enter vaild number:"+ num1);
		}
		sc.close();
	}
}
