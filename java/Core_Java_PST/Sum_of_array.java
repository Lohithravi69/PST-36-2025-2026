package Core;

import java.util.Scanner;

public class Sum_of_array {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size:");
	int num=sc.nextInt();
	int sum=0;
	int arr[]=new int[num];
	System.out.print("Enter an array elements:");
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
		sum+=arr[i];
		
	}
	System.out.println("The sum of elements are:" + sum);
	sc.close();
	}}