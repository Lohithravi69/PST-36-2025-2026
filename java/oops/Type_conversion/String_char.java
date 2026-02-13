package type_convertion;
import java.util.*;
public class String_char {

	public static void main(String[] args) {
		
		Strin.method2();
	}

}
class Strin{
	/*static void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.next();
		char ch=a.charAt(0);
		System.out.println(ch);
	}*/
	static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.next();
		int len=a.length();
		for(int i=0;i<len;i++) {
		char ch=a.charAt(i);
		System.out.print(ch);
		}
	}
}