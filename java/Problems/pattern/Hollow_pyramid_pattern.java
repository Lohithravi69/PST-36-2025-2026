package package1;
import java.util.Scanner ;
public class Hollow_pyramid_pattern {
public static void main(String args[]) {
	
	Hollow_pyramid_pattern obj=new Hollow_pyramid_pattern();
}
Hollow_pyramid_pattern (){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size of pattern");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num-i;j++) {
			System.out.print("");
		}
		
		for(int k=1;k<=(2*i-1);k++) {
			if(k==1||k==(2*i-1)||i==num) {
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
