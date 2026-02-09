package Problems;
import java.util.*;
public class Duplicate_element_array {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an size of an array:");
		int size=sc.nextInt();
		System.out.print(dup_arr(size));
	}
	static Boolean dup_arr(int size) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elemtents for array:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicates"+ arr[i]);
				}
			}
		}
		return (Boolean)null;
	}
}
