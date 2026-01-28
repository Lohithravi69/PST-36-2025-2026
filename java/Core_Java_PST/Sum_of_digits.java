package Core;
import java.util.Scanner;
public class Sum_of_digits {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in) ;
	
			System.out.println("enter number");
			int num=sc.nextInt();
			

			int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num/=10;
		} 
		System.out.print(sum);
		sc.close();
}}
