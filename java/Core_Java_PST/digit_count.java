package Core;
import java.util.Scanner;
public class digit_count {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter digits");
	int num=sc.nextInt();
	long count=0;
	
	
	while(num!=0) {
		count++;
		num/=10;
		
	}
	System.out.println( count);
	sc.close();
	}
}

