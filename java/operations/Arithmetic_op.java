package pt;
import java.util.Scanner;
public class Arithmetic_op {
	public static void main(String args[]) {
		int a,b,sum,sub,mul,div,mod;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first value :");
		a=sc.nextInt();
		System.out.print("Enter sec value :");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("the add os two value is:"+ sum);
		sub=a-b;
		System.out.println("the sub os two value is:"+ sub);
		mul=a*b;
		System.out.println("the mul os two value is:"+ mul);
		div=a/b;
		System.out.println("the add os two value is:"+ div);
		mod=a%b;
		System.out.println("the add os two value is:"+ mod);
	}

}
