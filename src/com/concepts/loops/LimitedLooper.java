package com.concepts.loops;

public class LimitedLooper {
	
	public void printLetterXTimes(char letter, int x) {

		/*
		 * int i =0; --- this defines my iterator
		 * i<xl; -- your check condition
		 * i++ --- After the code block runs
		 * */
		for( int i=0;  i<x;  i++ ) {
			
			System.out.print(letter);
		
		}
		System.out.println("");
		
		
		//Can be written in a while loop also;
//		int i = 0;
//		while(i<x) {
//			System.out.print(letter);
//			i++;
//		}
//
//		System.out.println("");
		
	}

}
