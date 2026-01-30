package Problems;
import java.util.*;
public class Strong_number {
	private static int factorial(int n) {
	int factorial=1;
	for(int i=1;i<=n;i++) {
		factorial*=i;
		}
	return factorial;
}

public static void main(String args[] ) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an number:");
	int n=sc.nextInt();
	int temp=n;
	int sum=0;
	
	
		
	
	while(n>0) {
		int digit=n%10;
		sum+=factorial(digit);
		n/=10;
	}
	if(sum==temp) {
		System.out.println("Strong num");
	}
	else {
		System.out.println("not a strong number");
	}



}}