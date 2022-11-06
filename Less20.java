package numbers;

import java.util.Scanner;

public class Less20 {
	public boolean less20(int n) {
	    if(n % 20 == 19 || n % 20 == 18){
	      return true;
	    }
	    return false;
	}
	public static void main(String[] args) {
		Less20 l20=new Less20();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		System.out.println("Output is "+l20.less20(n));
}
}
