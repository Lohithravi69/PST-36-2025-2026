package oops;
import java.util.*;
public class Anagram_String {
	public static void main(String args[]) {
		Anagram_String obj=new Anagram_String();
		
	}
	Anagram_String(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an String 1:");
		String str1=sc.next();
		System.out.println("Enter an string 2:");
		String str2=sc.next();
		String a=str1.toLowerCase();
		String b=str2.toLowerCase();
		int len1=a.length();
		int len2=b.length();
		if(len1!=len2) {
			System.out.println("The given string is not an anagram");
			return;
			
		}
		int arr[]=new int[256];
		
		for(int i=0;i<len1;i++) {
			arr[a.charAt(i)]++;
			arr[b.charAt(i)]--;
			
		}
		boolean isanagram=true;
		for(int c:arr) {
			if(c!=0) {
				isanagram=false;
				break;
			}
		}
		if(isanagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not an anagram");
		}
		sc.close();
	}
}
