package numbers;

import java.util.Scanner;

public class SquirrelPlay {
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer==false && temp >= 60 && temp <= 90){

		    return true;
		}
		  if (isSummer==true && temp >= 60 && temp <=100){

		    return true;
		}
		  else
		    return false;
		}
	public static void main(String[] args) {
		SquirrelPlay sp=new SquirrelPlay();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp: ");
		int temp=sc.nextInt();
		System.out.println("Enter summer: ");
		boolean isSummer=sc.nextBoolean();
		System.out.println("Output is "+sp.squirrelPlay(temp, isSummer));
				
	}

}
