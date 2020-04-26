package org.desi.coder.algorithm.sorting;

public class SelectionSort {

	public static void printArray(int[] data) {
		for (int dataElement : data) {
			System.out.print(dataElement + " ");
		}
		System.out.println("");

	}

	/*
	 * Find the least element from the unsorted part of the array and bring it to
	 * the front
	 */
	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int element = arr[i];
			int elementId = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < element) {

					element = arr[j];
					elementId = j;
				}

			}

			// once we get the least element
			int temp = arr[i];
			arr[i] = element;
			arr[elementId] = temp;
			printArray(arr);
		}
	}
}
