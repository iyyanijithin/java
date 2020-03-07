package org.jitsonfire.basics;

public class HelloWorld {

	@FunctionalInterface
	interface Greet {

		void greet();
	}

	@FunctionalInterface
	interface Add {
		int add(int a, int b);
	}

	@FunctionalInterface
	interface Square {
		int square(int a);
	}

	public static void main(String[] args) {

		// defination of the interfaces
		Greet g1 = () -> {
			System.out.println("This is lamda 1");
		};
		g1.greet();

		Add a1 = (a, b) -> {
			return a + b;
		};

		Square s1 = (int a) -> {

			return a * a;
		};

		System.out.println(a1.add(1, 2));
		System.out.println(s1.square(2));
	}

}
