package Problems;
import java.util.*;
public class second_largest_number {
	static int sec(int size) {
		Scanner sc=new Scanner(System.in);
	
		int arr[]=new int[size];
		System.out.println("Enter an elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
			int largest=arr[0];
			int sec_lar=arr[0];
			for(int i=0;i<size;i++) {
			if(arr[i]>largest) {
				sec_lar=largest;
				largest=arr[i];
				}
			else if(arr[i]>sec_lar && arr[i]!=largest) {
				sec_lar=arr[i];
			}
			}
			
		
		return sec_lar;
	}
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a size of an element:");
	int size=sc.nextInt();
	System.out.println(second_largest_number.sec(size));
}
}
