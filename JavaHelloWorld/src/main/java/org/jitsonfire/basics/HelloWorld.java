package org.jitsonfire.basics;

public class HelloWorld {

	interface Greet {

		void greet();
	}

	public static void main(String[] args) {

		Greet g1 = () -> {
			System.out.println("This is lamda 1");
		};
		g1.greet();
	}

}
