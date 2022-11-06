package numbers;

import java.util.Scanner;

public class CaughtSpeeding {
	public int caughtSpeeding(int speed, boolean isBirthday)
	{
		if(isBirthday){
			speed -=5;} //  diff limit is higher now
		if(speed <= 60){
			return 0;}
		else if(speed <= 80){
			return 1;}
		else
			return 2;
	}
	public static void main(String[] args) {
		CaughtSpeeding cs=new CaughtSpeeding();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Speed: ");
		int speed=sc.nextInt();
		System.out.println("Enter Birthday: ");
		boolean isBirthday=sc.nextBoolean();
		System.out.println("Output is "+cs.caughtSpeeding(speed, isBirthday));
				
	}
}
