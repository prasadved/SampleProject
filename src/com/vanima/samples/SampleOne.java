package com.vanima.samples;

import java.util.function.Supplier;


public class SampleOne {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Supplier<String> p = () -> "Vanima" ;
		System.out.println(p.get());
		System.out.println("added to validate commit amend");
		

		System.out.println("BranchOne changes");

		System.out.println("branchtwo 1.0 changes");

	}
}
