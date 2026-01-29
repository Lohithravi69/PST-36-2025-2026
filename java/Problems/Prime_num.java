package Problems;
import java.util.*;
public class Prime_num {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter num:");
	int a=sc.nextInt();
	boolean isprime=true;
	for(int i=2;i<=Math.sqrt(a);i++) {
		if(a%i==0) {
			isprime=false;
			
		}
		
	}
	if(isprime) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
}
}
