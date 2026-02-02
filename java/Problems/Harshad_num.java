package Problems;
import java.util.*;
public class Harshad_num {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number");
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
			
		}if(original%sum==0) {
			System.out.println("harshad num");
		}
		else {
			System.out.println("not an harshad num");
			
		}
		sc.close();
		}
}
