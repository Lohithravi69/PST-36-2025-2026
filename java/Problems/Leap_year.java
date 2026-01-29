package Problems;

import java.util.Scanner;

public class Leap_year {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
	if(year%4==0 ||year%400==0 ) {
		System.out.println("Leap year");
	}
	else if(year%100==0){
		System.out.println(" leap year");
	}
	else {
		System.out.println("not an leap year");
	}
	sc.close();
	}
}
