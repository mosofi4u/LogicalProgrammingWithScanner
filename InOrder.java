package numbers;

import java.util.Scanner;

public class InOrder {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if (b > a && c > b){
		      return true;
		    }
		  else if(bOk==true && c>b){
		    return true;
		}
		    return false;
		  
		}
	public static void main(String[] args) {
		InOrder io=new InOrder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of a: ");
		int a=sc.nextInt();
		System.out.println("Enter Number of b: ");
		int b=sc.nextInt();
		System.out.println("Enter Number of c: ");
		int c=sc.nextInt();
		System.out.println("Enter bok: ");
		boolean bok=sc.nextBoolean();
		System.out.println("Output is "+io.inOrder(a, b, c, bok));
	}
}
