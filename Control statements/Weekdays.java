package pt;

import java.util.Scanner;

public class Weekdays {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number(1-7):");
		int weekdays=scan.nextInt();
		String day;
		switch(weekdays) {
		case 1:
			day="sunday";
			break;
		case 2:
			day="monday";
			break;
		case 3:
			day="tuesday";
			break;
		case 4:
			day="wednesday";
			break;
		case 5:
			day="thrusday";
			break;
		case 6:
			day="friday";
			break;
		case 7:
			day="saturday";
			break;
		default:
			day="invalid";
			break;
			
			
		}
		System.out.println("weekday is:" + day);
		}
		
	}
	

