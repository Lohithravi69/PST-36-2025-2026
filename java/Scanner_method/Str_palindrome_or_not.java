package scanner;

import java.util.Scanner;

public class Str_palindrome_or_not {
public static void main(String args[]) {
		
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		 String a= sc.next() ;
		/* String reversed="";
		 int len=a.length() -1;
		 for(int i=len;i>=0;i--) {
			 	reversed +=a.charAt(i);		 
			 }
		 if(a.equals(reversed)) {
			 System.out.println("the given code is palindrome");
		 }
		 else {
			 System.out.println("not palindrome");
		 } */
			
		 boolean ispalindrome=true;
		 int len=a.length();
		 for(int i=0;i<len/2;i++) {
			 if(a.charAt(i) != a.charAt(len-i-1)) {
				 ispalindrome=false;
				break;
			 }
		 }
		 if(ispalindrome) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not palindrome");
		 }
		sc.close(); 
	
}
}
