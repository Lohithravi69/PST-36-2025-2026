package package1;
import java.util.Scanner;
public class Right_pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right_pascal_triangle obj1=new Right_pascal_triangle();
	}
	Right_pascal_triangle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of pattern");
		int n=sc.nextInt();
		int Space=2*(n-1);
		int stars=1;
		for(int i=0;i<(2*n-1)+1;i++) {
			for(int j=1;j<stars;j++)
			System.out.print("*");
			for(int j=1;j<=stars+1;j++)
				System.out.print(" ");
			System.out.println();
			System.out.println();
			if(i<n) {
				stars++;
				Space-=2;
			}
			else {
				stars--;
				Space+=2;
			}
		}
	}

}
