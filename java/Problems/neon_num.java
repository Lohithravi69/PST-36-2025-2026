package Problems;

import java.util.Scanner;

public class neon_num {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter an number:");
	int num=sc.nextInt();
	int sum=0;
	int aq=num*num;
	while(aq!=0) {
		
		int tb=aq%10;
		sum+=tb;
		aq/=10;
		
	}if(sum==num) {System.out.println("neon number");}
	else {
		System.out.println("not an neon number");
	}
}}
