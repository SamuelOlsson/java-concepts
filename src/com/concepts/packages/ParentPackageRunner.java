package com.concepts.packages;

import com.concepts.packages.childPackage.ChildOne;
import com.concepts.packages.childPackage.ChildTwo;

public class ParentPackageRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne childOne = new ChildOne();
		ChildTwo childTwo = new ChildTwo();
		Parent parent = new Parent();

		System.out.println("Parent name :> "+parent.name);
//		System.out.println("Child One :> "+childOne.name); //FAILS because its package private
		System.out.println("Child Two :> "+childTwo.name);
		
		
	}

}
