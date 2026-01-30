package Problems;
import java.util.*;
public class perfect_num {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num/2;i++) {
		if(num%i==0) {
			sum+=i;
			System.out.println(i);
		}}
		if(sum==num) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not an perfect number");
		}
	sc.close();
}
}
