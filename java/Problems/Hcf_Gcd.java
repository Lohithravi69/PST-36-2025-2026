package Problems;

import java.util.Scanner;


public class Hcf_Gcd {
	static int  HCF(int num1,int num2) {
		if(num1==0) {
			System.out.println(num2+"is gcd");
		}
		else if(num2==0) {
			System.out.println(num1+"is gcd");
		}
		while (num2!=0) {
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		return num1;
	
}
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter an number1:");
	int num1=sc.nextInt();
	System.out.println("Enter an number2");
	int num2=sc.nextInt();
	sc.close();
	
	HCF(num1,num2);
	
}
	}
