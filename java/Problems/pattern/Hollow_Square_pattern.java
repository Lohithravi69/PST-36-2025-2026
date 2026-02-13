package package1;
import java.util.Scanner;
public class Hollow_Square_pattern {


public static void main(String args[]) {
	Hollow obj=new Hollow();
}
}
class Hollow{
	Hollow() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of pattern");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			
			
			for(int j=0;j<num;j++) {
				if(i==0||i==num-1||j==0||j==num-1) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
		
	}
}
