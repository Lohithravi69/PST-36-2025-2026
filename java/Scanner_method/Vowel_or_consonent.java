package scanner;

import java.util.Scanner;

public class Vowel_or_consonent {
	public static void main(String args[]) {
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a character");
			String a=sc.next();
			String vowels="aeiouAeiou";
			if(a=="a"||a=="e"||a=="i"||a=="o"||a=="u"||a=="A"||a=="E"||a=="I"||a=="O"||a=="U") {
					System.out.println("the given String is vowel");
					
			}
			else {
				System.out.println("the given string is consonent");
			}
			sc.close();
	}

}
