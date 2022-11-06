package numbers;

import java.util.Scanner;

public class LastDigit {

public boolean lastDigit(int a, int b, int c) {
    if ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10)){
    return true;
}
    return false;
}
	public static void main(String[] args) {
	LastDigit ld=new LastDigit();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a: ");
	int a=sc.nextInt();
	System.out.println("enter b: ");
	int b=sc.nextInt();
	System.out.println("enter c: ");
	int c=sc.nextInt();
	System.out.println("Output is "+ld.lastDigit(a, b, c));		
}
}
