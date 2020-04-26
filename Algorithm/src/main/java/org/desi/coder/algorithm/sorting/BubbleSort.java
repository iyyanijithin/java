package org.desi.coder.algorithm.sorting;

public class BubbleSort {

	public static void printArray(int[] data) {
		for (int dataElement : data) {
			System.out.print(dataElement + " ");
		}
		System.out.println("");

	}

	public static void sort1(int[] data) {

		System.out.println("Before sort");
		printArray(data);
		int count = 0;
		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data.length - 1; j++) {

				count = count + 1;
				if (data[j] > data[j + 1]) {
					int temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
				}
			}
			System.out.println("Pass " + (i + 1));
			printArray(data);
		}
		System.out.println("After sort");
		System.out.println("Total number of time elements were visited " + count);
		printArray(data);

	}

	public static void sort2(int[] data) {

		System.out.println("Before sort");
		printArray(data);
		int count = 1;
		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data.length - 1 - i; j++) {

				count = count + 1;
				if (data[j] > data[j + 1]) {
					int temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
				}
			}
			System.out.println("Pass " + (i + 1));
			printArray(data);
		}
		System.out.println("After sort");
		System.out.println("Total number of time elements were visited " + count);
		printArray(data);

	}
}
