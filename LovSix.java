package numbers;

import java.util.Scanner;

public class LovSix {
	public boolean love6(int a, int b) {
		  if(a==6 || b==6 || a+b==6 || Math.abs(a-b)==6){
		    return true;
		  }
		  return false;
		}
	public static void main(String[] args) {
		LovSix ls=new LovSix();
		Scanner sc=new Scanner(System.in);
		System.out.println("you data: ");
		int a=sc.nextInt();
		System.out.println("date data: ");
		int b=sc.nextInt();
		System.out.println("Output is "+ls.love6(a, b));		
	}
}
