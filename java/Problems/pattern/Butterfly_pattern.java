package package1;
import java.util.Scanner;
public class Butterfly_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Butterfly_pattern obj1=new Butterfly_pattern();
	}
public	Butterfly_pattern(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number");
		int n=sc.nextInt();
		int space=2*(n-1);
		int stars=1;
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=stars;j++) 
				System.out.print("*");
			for(int j=1;j<=space;j++)		
			System.out.print(" ");
		for(int j=1;j<=stars;j++) 
			System.out.print("*");
		System.out.println();
		if(i<n) {
			stars++;
			space-=2;
		}
		else {
			stars--;
			space+=2;
		}
		}
		
		
		
	}

}
