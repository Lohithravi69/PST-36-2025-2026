package Problems;
import java.util.*;
public class Duck_num {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int num=sc.nextInt();
		int temp=num;
		boolean zero=false;
		while(num!=0) {
			if(num%10==0) {
				
				zero=true;
				break;
			}num/=10;
		}
		if(zero) {
			System.out.println("duck number");
		}
		else {
			System.out.println("not an duck number");
		}
		sc.close();		}
	
}
