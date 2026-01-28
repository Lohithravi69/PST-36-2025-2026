package Core;

import java.util.Scanner;

public class Num_palindrome {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int original=num;
		int i=0;
	while(num!=0) {
		i=i*10+num%10;
		num/=10;
	} 
	
	if(original==i) {
		System.out.println("Given num is palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	System.out.println( i);
	scan.close();
	}
}

