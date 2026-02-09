package Problems;
import java.util.*;
public class lages_element_array {
	
	static int array(int num) {
		int arr[]=new int[num];
		System.out.println("Enter an array elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		for (int i=0;i<num;i++) {
			if (largest<arr[i])
				largest=arr[i];
			
			
		}
		System.out.println(largest);
		sc.close();
		
		return largest;
	}
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an size of an arr");
	int num=sc.nextInt();
	System.out.println(array(num));
	sc.close();
}
}
