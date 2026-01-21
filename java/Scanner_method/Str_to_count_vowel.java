package scanner;

import java.util.Scanner;

public class Str_to_count_vowel {
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		int vowelcount=0;
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowelcount++;
		}}
		if(vowelcount>0) {
			System.out.println("the given string contains vowels:"+vowelcount);
		}
		else {
			System.out.println("the given string has only consonents");
		}
		sc.close();

}}
