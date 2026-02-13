package type_convertion;
import java.util.*;
public class String_int {
public static void main(String args[]) {
	
	Str.method2();
}
}
class Str{
	/*static void Int() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String a=sc.next();
		System.out.println(Integer.valueOf(a));
	}*/
	static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String num=sc.next();
		int len=num.length();
		int result=0;
		for(int i=0;i<len;i++) {
			char temp=num.charAt(i);
			 int value=temp-48;
			result =result*10+value;
		}
		System.out.println(result);
			
		
	}
}

