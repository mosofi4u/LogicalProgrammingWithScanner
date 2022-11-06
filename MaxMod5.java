package numbers;

import java.util.Scanner;

public class MaxMod5 {
	public int maxMod5(int a, int b) {
		  if(a%5==b%5 && a<b){
		   return a;
		 }
		 else if(a%5==b%5 && b<a){
		   return b;
		 }
		 else if(a>b){
		   return a;
		 }
		   return b;
		}
	public static void main(String[] args) {
		MaxMod5 m5=new MaxMod5();
		Scanner sc=new Scanner(System.in);
		System.out.println("a data: ");
		int a=sc.nextInt();
		System.out.println("b data: ");
		int b=sc.nextInt();
		System.out.println("Output is "+m5.maxMod5(a, b));		
	}
}
