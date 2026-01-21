package scanner;

import java.util.Scanner;

public class Vowel_or_consonent {
	public static void main(String args[]) {
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a character");
			String a=sc.next();
			
			if(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u")) {
					System.out.println("the given String is vowel");
					
			}
			else {
				System.out.println("the given string is consonent");
			}
			sc.close();
	}

}
