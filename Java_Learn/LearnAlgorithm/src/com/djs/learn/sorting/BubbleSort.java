
package com.djs.learn.sorting;

public class BubbleSort extends AbstractSorting
{
	public String getMethodName(){
		return "Bubble Sort";
	}

	@Override
	public Integer[] sort(Integer[] data, boolean output){
		int i, j;
		// This flag is for enhanced bubble sort.
		int haveSwap;

		if (output) {
			System.out.printf("%2c, %2c: ", 'i', 'j');
			printData(data);
		}

		// 1. In first sub-list, from the bottom, swap the largest element up to the top position.
		// 2. Decrease the sub-list.
		// 3. In second sub-list, from the bottom, swap the largest element up to the next top position.
		// 4. Repeat 2 and 3.

		// From last element to 1 (not 0).
		for (i = data.length - 1; i > 0; i--) {
			haveSwap = 0;

			// From 1 (not 0) to i.
			for (j = 1; j <= i; j++) {
				if (data[j - 1] > data[j]) {
					// Swap.
					data[j - 1] = (Integer)swap(data[j], data[j] = data[j - 1]);

					if (output) {
						System.out.printf("      : %2d<=>%2d\n", j - 1, j);
					}

					// There is swap in this turn.
					haveSwap = 1;
				}
			}

			if (output) {
				System.out.printf("%2d, %2d: ", i, j);
				printData(data);
			}

			// If no swap in this turn, then it means all sorted, no need to do further sorting.
			if (haveSwap == 0) {
				break;
			}
		}

		return data;
	}
}
