package numbers;

import java.util.Scanner;

public class SortaSum {
	public int sortaSum(int a, int b) {
		  int sum = a+b;
		  if(sum>=10 && sum<=19)
		  {
		  return 20;
		}
		return sum;
		  
		}
	public static void main(String[] args) {
		SortaSum ss=new SortaSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		System.out.println("enter b: ");
		int b=sc.nextInt();
		System.out.println("Output is "+ss.sortaSum(a, b));		
	}
}
