package pt;
import java.util.Scanner;
public class Greatest_among_3_num {
	public static void main(String args[]) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1:");
		num1=sc.nextInt();
		System.out.print("Enter number 2:");
		num2=sc.nextInt();
		System.out.print("Enter number 3:");
		num3=sc.nextInt();
		if(num1>num2) {
			 if(num1>num3) {
				
			}
			 System.out.println("number 1 is greater"+ num1);
		}
		else if(num2>num1) {
			if(num2>num3) {
				
			}
			System.out.println("number 2  is greater"+ num2);
		}
		else {
			System.out.println("number 3 is greater:"+ num3);
		}
	}

}
