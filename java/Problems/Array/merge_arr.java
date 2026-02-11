package Problems;
import java.util.Scanner;
public class merge_arr {
	public static void main(String[] args) {
		Merge.array();
	}
}
class Merge{
	static void array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of first array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		int i=0;
		int j=0;
		System.out.println("Enter an first array elements ");
		for( i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter an second array elements ");
		for( j=0;j<size;j++) {
			arr2[j]=sc.nextInt();
		}
		//merge arr
		int n=size*2;
		int arr3[]=new int[n];
		for(int k=0;k<size;k++) {
		 arr3[k]=arr1[k];
		 arr3[size+k]=arr2[k];
	}
		for(i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+",");
		}
			}

}
	