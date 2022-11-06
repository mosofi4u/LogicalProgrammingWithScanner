package numbers;

import java.util.Scanner;

public class NearTen {
	public boolean nearTen(int num) {
	      if(num % 10 <= 2 || num % 10 >= 8){
	        return true;
	      }
	        return false;
	}
	public static void main(String[] args) {
		NearTen nt=new NearTen();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=sc.nextInt();
		System.out.println("Output is "+nt.nearTen(n));
}
}
