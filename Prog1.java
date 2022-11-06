package numbers;

import java.util.Scanner;

public class Prog1 {
//	public static void test(int n1, boolean b1) {
//		System.out.println("test");
//		System.out.println(n1+""+b1);
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter one int number");
//		int n1=sc.nextInt();
//		System.out.println("enter one boolean");
//		boolean b1=sc.nextBoolean();
//		test(n1,b1);
//	}
	public static void test(int n1, boolean b1, short s1, long l1, double d1) {
		System.out.println("test");
		System.out.println(n1+"" + s1+"/"+l1+"/"+d1+"/"+b1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one int number");
		int n1=sc.nextInt();
		System.out.println("enter one boolean");
		boolean b1=sc.nextBoolean();
		System.out.println("enter one short");
		short s1=sc.nextShort();
		System.out.println("enter one long");
		long l1=sc.nextLong();
		System.out.println("enter one double");
		double d1=sc.nextDouble();
		test(n1,b1,s1,l1,d1);
	}
}
