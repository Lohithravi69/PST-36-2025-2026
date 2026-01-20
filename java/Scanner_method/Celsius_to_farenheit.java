package scanner;

import java.util.Scanner;

public class Celsius_to_farenheit {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter celsius number :");
		float a=sc.nextFloat();
		double b=(a*1.8)+32;
		System.out.println("The farenheit for given celsius is:"+b);
		sc.close();
}

}
