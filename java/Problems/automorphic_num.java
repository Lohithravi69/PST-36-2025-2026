package Problems;
import java.util.*;
public class automorphic_num {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an number:");
	int num=sc.nextInt();
	int Dou=num*num;
	
		if(num==Dou%100) {
			System.out.println("automorphic number");
		}
		else {
			System.out.println("not an automorphic number");
		}
	
	}
}
