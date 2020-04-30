package org.desi.coder.algorithm;

import org.desi.coder.algorithm.sorting.BubbleSort;
import org.desi.coder.algorithm.sorting.SelectionSort;

/**
 * Hello world!
 *
 */
public class App {

	public static void printArray(int[] data) {
		for (int dataElement : data) {
			System.out.print(dataElement + " ");
		}
		System.out.println("");

	}

	public static void main(String[] args) {
		
		/*
		int[] arr = { 5, 4, 3, 2, 1 };
		BubbleSort.sort1(arr);
		int[] arr2 = { 5, 4, 3, 2, 1 };
		BubbleSort.sort2(arr2);
		*/

		int[] arr3 = { 9,8,7,1,4};
		printArray(arr3);
		SelectionSort.sort(arr3);
		//printArray(arr3);

	}
}
