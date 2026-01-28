package Core;
import java.util.Scanner;
public class char_count_only_alphabet {
	
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter String");
			String a=scan.next();
			int count=0;
			for(char c:a.toCharArray()) {
			if(c>='a' && c<='z') {
				count++;}
			}
			System.out.println(count);
			
		scan.close();	
	
	}
}
