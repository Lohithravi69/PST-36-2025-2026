package Problems;

import java.util.*;
public class smallest_array {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size of an array");
	int size=sc.nextInt();
	
	System.out.println(array(size));
	
	
}
static int array(int size) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[size];
	System.out.println("Enter array elements ");
	for(int i=0;i<size;i++ ) {
		arr[i]=sc.nextInt();
	}
	int smallest=arr[0];
	for(int i=0;i<size;i++) {
		if(smallest>arr[i]) {
			smallest=arr[i];
			break;
		}
		
	}System.out.print("smallest is:");
	return smallest;
	
}
}
