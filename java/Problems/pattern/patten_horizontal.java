package practice;
import java.util.*;
public class patten_horizontal {

	public static void main(String[] args) {
		New obj=new New();
		obj.horizontal();

	}

	
	

	
		
	}
class New{
	public static void horizontal() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an number:");
		int num=sc.nextInt();
		System.out.print("The horizonatl pattern is:");
		for(int i=0;i<num;i++) {
			System.out.print(" * ");
		}
		
	}

}

