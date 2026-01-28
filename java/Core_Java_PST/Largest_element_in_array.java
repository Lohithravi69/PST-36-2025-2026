package Core;

import java.util.Scanner;

public class Largest_element_in_array {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in) ;
		
				System.out.println("enter size:");
				int num=sc.nextInt();
				int arr[]=new int[num];
				System.out.println("Enter an array elemets:");
				for(int i=0;i<num;i++) {
					arr[i]=sc.nextInt();}
				
					int largest=arr[0];
					for(int i=0;i<num;i++) {
					if(largest<arr[i]) {
						largest=arr[i];
					}
				
				
	}System.out.println(largest);
	sc.close();
}
}