package type_convertion;
import java.util.*;
public class char_String  {

	public static void main(String[] args) {
		Char.method2();;
	}

}
class Char{
	/*static void Str() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char a=sc.next().charAt(0);
		System.out.println(String.valueOf(a));
	}*/
	static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char a=sc.next().charAt(0);
		String result="";
		
		result=result+a;
		
		System.out.println(result);
	}
}