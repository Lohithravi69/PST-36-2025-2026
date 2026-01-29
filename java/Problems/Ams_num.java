package Problems;

import java.util.Scanner;

public class Ams_num {
	public static void main(String args[]) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amrstrong number :");
		int n=sc.nextInt();
		int temp=n;
		int original=n;
		long count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		long sum=0;
		while(temp!=0) {
			int digit=temp%10;
			sum+=Math.pow(digit, count);
			temp/=10;
			
		}
		if(sum==original) {
		System.out.println("Armstrong num");	
		}
		
		else {
			System.out.println("not an Armstrong num");
		}
		sc.close();
	}
}
