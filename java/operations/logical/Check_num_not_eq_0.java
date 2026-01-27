package logical;
import java.util.Scanner;
public class Check_num_not_eq_0 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter num:");
	 int num=sc.nextInt();
	 if(num!=0) {
		 System.out.println("The given num is not zero");
	 }
	 else {
		 System.out.println("the given num is zero");
		 
	 }
	 sc.close();
 }
}
