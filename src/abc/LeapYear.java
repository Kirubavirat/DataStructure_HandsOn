package abc;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		boolean flag=false;
		
		if(year%400==0) {
			flag=true;
		}else if(year%100==0) {
			flag=false;
		}else if(year%4==0) {
			flag=true;
		}else {
			flag=false;
		}
		if(flag) {
			System.out.println("year "+year+" is leap year");
		}else {
			System.out.println("year "+year+" is not  leap year");
		}

	}

}
