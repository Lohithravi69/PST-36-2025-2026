package oops;
import java.util.*;
public class Missing_num {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an size of array:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
	}
	int len=arr.length+1;
	int expectedsum=len*(len+1)/2;
	int actualsum=0;
	for(int num:arr) {
		actualsum+=num;
	}
	int missingnum=expectedsum-actualsum;
	System.out.println(missingnum);
}
}
