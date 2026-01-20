package week2;

import java.util.Arrays;
import java.util.Scanner;

public class rev_str_word {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the word:");
		 String a= scan.next() ;
		 int len=a.length() -1;
		 for(int i=len;i>=0;i--) {
			 System.out.print(a.charAt(i));
		 }
		
		scan.close();
	}
}
