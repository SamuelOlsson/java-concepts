package com.concepts.dataTypes;

public class DataTypesRunner {

	public static void main(String[] args) {
		
		//primitives data types. Can never be null
		double doubleValue = 0.0;
		int intValue = 0;
		int intValueTwo = 0;
		long longValue = 0l;
		float floatVal = 0f;
		char charValue = 'A';
		char[] charArray = {'T', 'E'}; //String is actually this
		
		Double doubleWrapper = null;
		Double doubleWrapperTwo = new Double(1.2);
		Integer intWrapper = 0;
		Integer intWrapperTwo = new Integer(0);
		

		System.out.println("1. Are they equal? "+ (intWrapper == intWrapperTwo) ); // Compares objects not values
		System.out.println("\n2. Are they equal? "+ (intWrapper.equals(intWrapperTwo)) );
		System.out.println("\n3. Are they equal? "+ (intValue == intValueTwo) );

		
		String stringValue = "ABC";
		String stringValueTwo = "ABC";
		
		System.out.println(stringValue.charAt(2));
		System.out.println(stringValue.toLowerCase());
		System.out.println("\nAre they equal? "+stringValue == stringValueTwo);

		//Class is just a type definition
		CarMake[] carMakeTypes =  {};
		
		
	}

}
