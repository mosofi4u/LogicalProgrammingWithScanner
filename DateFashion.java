package numbers;

import java.util.Scanner;

public class DateFashion {
	public int dateFashion(int you, int date) {
		  if(you<=2 || date<=2)
		  {
		    return 0;
		  }
		   else if(you>=8 || date>=8)
		  {
		    return 2;
		  }
		  return 1;
		}
	public static void main(String[] args) {
		DateFashion df=new DateFashion();
		Scanner sc=new Scanner(System.in);
		System.out.println("you data: ");
		int you=sc.nextInt();
		System.out.println("date data: ");
		int date=sc.nextInt();
		System.out.println("Output is "+df.dateFashion(you, date));		
	}
}
