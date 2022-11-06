package numbers;

import java.util.Scanner;

public class In1To10 {
	public boolean in1To10(int n, boolean outsideMode) {
		  if(outsideMode==false && n>=1 && n<=10){
		    return true;
		  }
		else  if(outsideMode==true && (n<=1 || n>=10))
		{
		    return true;
		  }
		  return false;
		}
	public static void main(String[] args) {
		In1To10 it=new In1To10();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println("Enter outsidemode: ");
		boolean isWeekend=sc.nextBoolean();
		System.out.println("Output is "+it.in1To10(n, isWeekend));
				
	}
}
