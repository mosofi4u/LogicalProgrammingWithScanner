package numbers;

import java.util.Scanner;

public class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if (equalOk==false && a < b && b < c){
		    return true;
		  }
		  else if(equalOk==true && a <= b && b <= c){
		    return true;
		}
		return false;
		}
	public static void main(String[] args) {
		InOrderEqual ioe=new InOrderEqual();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of a: ");
		int a=sc.nextInt();
		System.out.println("Enter Number of b: ");
		int b=sc.nextInt();
		System.out.println("Enter Number of c: ");
		int c=sc.nextInt();
		System.out.println("Enter equalok: ");
		boolean equalok=sc.nextBoolean();
		System.out.println("Output is "+ioe.inOrderEqual(a, b, c, equalok));
	}
}
