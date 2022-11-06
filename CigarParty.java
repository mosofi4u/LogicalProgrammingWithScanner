package numbers;

import java.util.Scanner;

public class CigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		  
		  if(cigars>=40 && cigars<=60){
		    return true;
		  }
		    else if(isWeekend==true && cigars>=40){
		      return true;
		    }
		    return false;
		  }
		public static void main(String[] args) {
			CigarParty cp=new CigarParty();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number of Cigars: ");
			int cigars=sc.nextInt();
			System.out.println("Enter Boolean: ");
			boolean isWeekend=sc.nextBoolean();
			System.out.println("Output is "+cp.cigarParty(cigars, isWeekend));
					
		}
}
