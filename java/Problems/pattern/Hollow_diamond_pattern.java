package package1;
import java.util.*;
public class Hollow_diamond_pattern {
	public static void main(String args[]) {
		Hollow_diamond_pattern obj1=new Hollow_diamond_pattern();
	
}
	Hollow_diamond_pattern(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of pattern");
		int size=sc.nextInt();
		method(size);
		
}
	public static void method(int size) {
		int space=size-1;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=space;j++) {
			System.out.print(" ");
			
		}
		space--;
		for(int k=1;k<=2*i-1;k++) {
			if(k==1||k==2*i-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
		
	}
		space=1;
		for(int i=1;i<=size-1;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(int k=1;k<=2*(size-i)-1;k++) {
				if(k==1||k==2*(size-i)-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	}
