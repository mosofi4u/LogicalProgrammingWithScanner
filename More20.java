package numbers;

import java.util.Scanner;

public class More20 {
	public boolean more20(int n) {
	    if(n % 20 == 1 || n % 20 == 2){
	      return true;
	    }
	    return false;
	}
	public static void main(String[] args) {
		More20 m2=new More20();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		System.out.println("Output is "+m2.more20(n));
}
}
