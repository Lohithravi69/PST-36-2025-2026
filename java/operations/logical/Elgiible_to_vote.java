package logical;

import java.util.Scanner;

public class Elgiible_to_vote {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter your age:");
		 int num=sc.nextInt();
		 if(num>=18) {
			 System.out.println("you are eligible to vote ");
		 }
		 else {
			 System.out.println("you are not eligible to vote");
			 
		 }
		 sc.close();
	 }
}
