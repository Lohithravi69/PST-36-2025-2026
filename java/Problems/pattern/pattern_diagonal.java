package practice;
import java.util.*;
public class pattern_diagonal {
public static void main(String args[]) {
	System.out.println(diagonal());
}
static String diagonal(){
	Scanner sc=new Scanner(System.in);
	System.out.println();
	int num=sc.nextInt();
	for(int i=1;i<num;i++) {
		System.out.println(" * ");
		for(int j=1;j<i+1;j++){
			System.out.print(" * ");
			
		}	
	}
	return " * ";
}
}
