package Problems;
import java.util.*;
public class left_rotate_array_by_one_position {

	public static void main(String[] args) {
		rotate.left();

	}

}
class rotate{
	
	static void left() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of an array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter an array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int first=arr[0];
		for(int i=0;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length -1]=first;
		System.out.println(Arrays.toString(arr));
	}
}
