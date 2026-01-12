package pt;
import java.util.Scanner;
public class IF_CONDITION {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=scan.nextInt();
		
		if(a>0) {
			System.out.println("num is positive");
		}
		else {
			System.out.println("negative");
		}scan.close();
	}
	

}
