package Problems;

import java.util.Scanner;

public class rev_num {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the no elements:");
		 int a= scan.nextInt() ;
		 int re=0;
		 int sum=0;
		 int count=0;
		 while(a!=0) {
			int b= a%10;
			re=re*10+b;
			 sum+=b;
			 count++;
			 a/=10;
		 }
		 if(a==re) {
			 System.out.println("palindrome");
			 
		 }
		 else{
			System.out.println("not palindrome");
		 } System.out.println("the reversed int is"+re);
		 System.out.println("the sum of digit"+sum);
		 System.out.println("The count of digit"+count);
		 
}
}