package numbers;

import java.util.Scanner;

public class AnswerCell {
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
	    if(isAsleep){
	        return false;
	    }
	          
	    if(isMorning && !isMom){
	        return false;
	    }
	                    
	    return true;
	}
	public static void main(String[] args) {
		AnswerCell ac=new AnswerCell();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter morning: ");
		boolean isMorning=sc.nextBoolean();
		System.out.println("Enter mom: ");
		boolean isMom=sc.nextBoolean();
		System.out.println("Enter asleep: ");
		boolean isAsleep=sc.nextBoolean();
		System.out.println("Output is "+ac.answerCell(isMorning, isMom, isAsleep));
				
	}
}
