package com.concepts.arrays;

public class ArraysRunner {

	public static void main(String[] args) {
		String name = "test"; // A string is an array of characters
		String[] schools = {"School One", "School Two"}; //recommended standar
		String schoolsTwo[]  = {"School One", "School Two"};
		
		System.out.println("Lenght before ::> "+schools.length);
//		schools[2] = "3"; // This Line will fail. Length can't be changed
		System.out.println("Lenght before ::> "+schools.length);
		
		
		System.out.println("Lenght before ::> "+schoolsTwo.length);
//		schoolsTwo[2] = new String("3"); // This Line will fail. Length can't be changed
		System.out.println("Lenght before ::> "+schoolsTwo.length);
		
		String[] hardDefinedSize = new String[3];
		System.out.println("Lenght before ::> "+hardDefinedSize.length);
		hardDefinedSize[2] = "3";
		System.out.println("Lenght before ::> "+hardDefinedSize.length);

	}

}
