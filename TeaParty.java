package numbers;

import java.util.Scanner;

public class TeaParty {
	public int teaParty(int tea, int candy) {
		  if(tea<5 || candy<5)
		  {
		    return 0;
		  }
		  else if(tea>=2*candy || candy>=2*tea)
		  {
		    return 2;
		  }
		  return 1;
		}
	public static void main(String[] args) {
		TeaParty tp=new TeaParty();
		Scanner sc=new Scanner(System.in);
		System.out.println("int tea: ");
		int tea=sc.nextInt();
		System.out.println("int candy: ");
		int candy=sc.nextInt();
		System.out.println("Output is "+tp.teaParty(tea, candy));		
	}
}
