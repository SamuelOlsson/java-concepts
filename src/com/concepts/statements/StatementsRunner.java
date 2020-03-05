package com.concepts.statements;

public class StatementsRunner {

	public static void main(String[] args) {
		
		boolean trueStatement = true;
		boolean falseStatement = false;
		
		//IF statements
		if(trueStatement) {
			System.out.println("TRue Statement");
		}
		
		// IF ELSE statements
		if(!trueStatement) {
			// Will only run under a true condition
			System.out.println("Inside false");
		}else {
			System.out.println("In else condition");
		}
		
		
		// IF & ELSE IF statements
		if(!trueStatement) {
			// Will only run under a true condition
			System.out.println("Inside false");
		}
		else if(!falseStatement) {
			System.out.println("In else if condition");
		}
		
		// IF & ELSE IF statements
		if(trueStatement) {
			// Will only run under a true condition
			System.out.println("Inside if of IF & ELSE IF statement");
		}
		else if(!falseStatement) {
			System.out.println("Second In else if condition");
		}
				
		
	}

}
