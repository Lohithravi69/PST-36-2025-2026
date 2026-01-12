package pt;
import java.util.Scanner;
public class Relative_op {
	public static void main(String args[]) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter value a:");
	a=sc.nextInt();
	System.out.print("Enter value b:");
	b=sc.nextInt();
	System.out.println(a==b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a!=b);
	System.out.println(a<b);
	System.out.println(a>b);
	
	}
}
