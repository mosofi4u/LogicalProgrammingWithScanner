package numbers;

import java.util.Scanner;

public class Old35 {
	public boolean old35(int n) {
	     if((n % 3 == 0) != (n % 5 == 0)){
	       return true;
	     }
	return false;
	}
	public static void main(String[] args) {
		Old35 o35=new Old35();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		System.out.println("Output is "+o35.old35(n));
}
}
