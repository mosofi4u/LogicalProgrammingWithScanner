package numbers;

import java.util.Scanner;

public class TeenSum {
	public int teenSum(int a, int b) {
		  int sum = a+b;
		  if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
		    return 19;
		}
		    return sum;
		}
	public static void main(String[] args) {
		TeenSum ts=new TeenSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("a data: ");
		int a=sc.nextInt();
		System.out.println("b data: ");
		int b=sc.nextInt();
		System.out.println("Output is "+ts.teenSum(a, b));		
	}
}
