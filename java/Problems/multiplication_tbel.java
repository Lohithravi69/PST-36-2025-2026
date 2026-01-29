package Problems;

import java.util.Scanner;

public class multiplication_tbel {
	public static void main(String args[]) {		
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number 1:");
			int n=sc.nextInt();
			int m=1;
			for(int i=1;i<=20;i++) {
				m=n*i;
				System.out.println(n +" x "+ i +" = "+ m);
			}
}
}