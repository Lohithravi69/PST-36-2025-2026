package week2;

import java.util.Scanner;
import java.util.Arrays;

public class rev_str_arr {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the no elements:");
		 int a= scan.nextInt() ;
		 scan.nextLine();
		 String arr[]=new String[a];
		System.out.println("eneter an elements:");
		for(int i=0;i<a;i++) {
			arr[i]=scan.nextLine();
			
		}System.out.println(Arrays.toString(arr));
		System.out.println("Reversed String");
		for(int i=a-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		scan.close();

	}

}
