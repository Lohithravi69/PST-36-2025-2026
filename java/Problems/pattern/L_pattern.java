package package1;
import java.util.*;
public class L_pattern {

	public static void main(String[] args) {
		
		L_pat.method2();
	}

}
class L_pat{
	static void method() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of pattern");
		int size=sc.nextInt();
		for(int i=0;i<size-1;i++) {
			System.out.println("*");}
		System.out.print("*");
			for(int j=0;j<size-1;j++) {
				System.out.print(" *");
			}
		
	}
	static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of pattern");
		int size=sc.nextInt();
		for(int i=1;i<size;i++) {
			System.out.println("*");
		}
		for(int i=0;i<size;i++) {
			System.out.print("* ");
		}
	}
}
