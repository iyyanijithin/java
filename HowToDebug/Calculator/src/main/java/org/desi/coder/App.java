package org.desi.coder;

/**
 * Hello world!
 *
 */
public class App {
	
	
	public static void main(String[] args) {

		// create a calc object
		Calculator calculator = new Calculator(); 
		// add two numbers
		System.out.println(calculator.add(5, 5));

		for (int i = 1; i < 100; i++) {

			System.out.println(calculator.add(i, i + 1));
		}

	}
}
