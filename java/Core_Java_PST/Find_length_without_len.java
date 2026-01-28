package Core;

import java.util.Scanner;

public class Find_length_without_len {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String a=scan.next();
		int count=0;
		for(char c:a.toCharArray()) {
			count++;
		}
		System.out.println(count);
		scan.close();
}
}