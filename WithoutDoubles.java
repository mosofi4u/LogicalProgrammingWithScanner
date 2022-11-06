package numbers;

import java.util.Scanner;

public class WithoutDoubles {
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
	    if(noDoubles && die1 == die2) {
	        die1++;
	    }
	      if(die1 == 7){
	            die1 = 1;
	    }
	                      
	    return die1 + die2;
	}
	public static void main(String[] args) {
		WithoutDoubles wd=new WithoutDoubles();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter die1: ");
		int die1=sc.nextInt();
		System.out.println("Enter die2: ");
		int die2=sc.nextInt();
		System.out.println("Enter nodoubles: ");
		boolean nodoubles=sc.nextBoolean();
		System.out.println("Output is "+wd.withoutDoubles(die1, die2, nodoubles));
				
	}
}
