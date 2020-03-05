package com.concepts.loops;

public class LoopsRunner {
	//Modifiers can only be used at a class level
	private static LimitedLooper limitedLooper = new LimitedLooper();

	public static void main(String[] args) {

		//For loop
		limitedLooper.printLetterXTimes('Y', 3);
		limitedLooper.printLetterXTimes('Y', 6);
		
		System.out.println("\n\nInfinite looper!");
		InfiniteLooper infiniteLooper = new InfiniteLooper();
		infiniteLooper.doWhileConditionLoop();
		
		System.out.println("\n\n Running the while looper \n");
		infiniteLooper.whileLooperCondition();
		
		
	}

}
