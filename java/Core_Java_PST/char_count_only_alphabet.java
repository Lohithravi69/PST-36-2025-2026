package Core;
import java.util.Scanner;
public class char_count_only_alphabet {
	
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter String");
			String a=scan.next();
			int count=0;
			for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				count++;}
			}
			System.out.println(count);
			
		scan.close();	
	
	}
}
