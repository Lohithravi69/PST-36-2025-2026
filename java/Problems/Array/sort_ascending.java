package Problems;
import java.util.*;
public class sort_ascending {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an size of an array");
		int size=sc.nextInt();
		System.out.println(ascending(size));
	}
	static boolean ascending(int size) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[size];
		System.out.println("Enter an elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("ascending of sorted array");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		return (Boolean) null;
	}
}
