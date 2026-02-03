package Problems;
import java.util.*;
public class magic_num {
	static boolean magic(int num) {
		
		int temp=num;
		while(num>9) {
			int sum=0;
			while(num>0) {
			
			sum+=num%10;
			num/=10;
			
		}System.out.println(sum);
		num=sum;
		}
		return num==1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an number:");
		System.out.println();
		int num=sc.nextInt();
		sc.close();
		
		if(magic(num)) {
			System.out.println("magic number");
		}
		else {
			System.out.println("not an magic number");
		}

	}
	

}
