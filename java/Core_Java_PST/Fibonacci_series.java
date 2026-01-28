package Core;

import java.util.Scanner;

public class Fibonacci_series {
 
	 public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter number of range");
			int range=scan.nextInt();
			
			if(range==0){
				System.out.println("Enter number greater than 0");
				
			}
			else if(range==1){
				System.out.println("0");
			}
			else if(range==2) {
				System.out.println("0,1");
			}
			else {
				int first=0;
				int second=1;
				System.out.println("Fibonacci series");
				for(int i=0;i<range;i++) {
					System.out.print(first+",");
					if(i<range)
						;
					int	temp=first+second;
					first=second;
					second=temp;
				}System.out.println();
 }
			scan.close();}
}
