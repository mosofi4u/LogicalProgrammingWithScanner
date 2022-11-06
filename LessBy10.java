package numbers;

import java.util.Scanner;

public class LessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		  if(a-b>=10 || a-c>=10|| b-a>=10 || b-c>=10 || c-a>=10 || c-b>=10){
		    return true;
		  }
		return false;
		}
	public static void main(String[] args) {
		LessBy10 lb10=new LessBy10();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		System.out.println("enter b: ");
		int b=sc.nextInt();
		System.out.println("enter c: ");
		int c=sc.nextInt();
		System.out.println("Output is "+lb10.lessBy10(a, b, c));		
	}
}
