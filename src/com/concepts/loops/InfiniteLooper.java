package com.concepts.loops;

import java.util.Scanner;

public class InfiniteLooper {

	private Scanner in = new Scanner(System.in);
	
	public void doWhileConditionLoop() {
		
		//Won't actually exit until user enters exit
		String userValue = "TEst"; 
		
		do {
			
			System.out.print("Enter value : ");
			//Will not work when defined here. Not available to while condition scope
//			String userValue = in.next(); 
			userValue= in.next(); 
			
		}while(!"exit".equalsIgnoreCase(userValue)); // You exit by breaking this condition
		
		System.out.println("Finally done looping! :)");
	}

	public void whileLooperCondition() {
		
		String exitLoopCondition = "n"; //The start condition has to be true for it to run
		
		while( !"y".equalsIgnoreCase(exitLoopCondition) ) {
			
			System.out.print("Exit or not (Y or N) : ");
			exitLoopCondition = in.next();
			
		}
		System.out.print("Done with the while loop");
		
	}
	
}
