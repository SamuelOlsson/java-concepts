package com.concepts.operators;

public class OperatorsRunner {

	public static void main(String[] args) {
		
		boolean tVal = true;
		boolean fVal = false;

		System.out.println("AND OPERATOR");
		System.out.println("True && True = "+(tVal && tVal));
		System.out.println("True && False = "+(tVal && fVal));
		System.out.println("False && False = "+(fVal && fVal));
		System.out.println("\n------------------------------------\n");
//		
		System.out.println("OR OPERATOR");
		System.out.println("True || True = "+(tVal || tVal));
		System.out.println("True || False = "+(tVal || fVal));
		System.out.println("False || False = "+(fVal || fVal));
		System.out.println("\n------------------------------------\n");
//		
		System.out.println("EXCLUSIVE OR OPERATOR");
		System.out.println("True ^ True = "+(tVal ^ tVal));
		System.out.println("True ^ False = "+(tVal ^ fVal));
		System.out.println("False ^ False = "+(fVal ^ fVal));
		System.out.println("\n------------------------------------\n");
//		
//
		System.out.println("NOT OPERATOR");
		System.out.println("!True = "+(!tVal));
		System.out.println("!False = "+(!fVal));
		System.out.println("\n------------------------------------\n");

	}

}
