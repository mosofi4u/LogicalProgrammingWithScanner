package numbers;

import java.util.Scanner;

public class SpecialEleven {
	public boolean specialEleven(int n) {
	    if((n % 11) == 0 || (n % 11) == 1){
	      return true;
	    }
	    return false;
	}
	public static void main(String[] args) {
		SpecialEleven se=new SpecialEleven();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		System.out.println("Output is "+se.specialEleven(n));
}
}