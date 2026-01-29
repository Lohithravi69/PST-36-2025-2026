package Problems;
import java.util.Scanner;
public class Simple_interet {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter amount");
	int P=sc.nextInt();
	int R=5;
	int T=2;
	double SI=(P*R*T)/100;
	System.out.println("The simple interest is:"+SI);
	sc.close();
}
}
