package numbers;

import java.util.Scanner;

public class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		  if(a + b == c || a + c == b || b + c == a){
		    return true;
		  }
		  return false;
		}
	public static void main(String[] args) {
		TwoAsOne to=new TwoAsOne();
		Scanner sc=new Scanner(System.in);
		System.out.println("int a: ");
		int a=sc.nextInt();
		System.out.println("int b: ");
		int b=sc.nextInt();
		System.out.println("int c: ");
		int c=sc.nextInt();
		System.out.println("Output is "+to.twoAsOne(a, b, c));		
	}
}
