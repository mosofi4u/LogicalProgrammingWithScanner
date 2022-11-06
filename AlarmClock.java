package numbers;

import java.util.Scanner;

public class AlarmClock {
	public String alarmClock(int day, boolean vacation) {
		  if (vacation==false && day>=1 && day<=5) {
		    return "7:00";
		}
		  else if(vacation==false && (day==0 || day==6)){
		    return "10:00";
		  }
		   if (vacation==true && day>=1 && day<=5) {
		    return "10:00";
		  }
		  return "off";
		}

	public static void main(String[] args) {
		AlarmClock ac=new AlarmClock();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day: ");
		int day=sc.nextInt();
		System.out.println("Enter vacation: ");
		boolean vacation=sc.nextBoolean();
		System.out.println("Output is "+ac.alarmClock(day, vacation));
				
	}
}
