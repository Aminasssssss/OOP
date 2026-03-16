package kbtu.oop.practice4.problem4.bonus;

import java.util.Arrays;


public class CountingSort {
	public void sort(int[] arr) {
        int[] count = new int[11];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int[] sorted = new int[arr.length];
        int idx = 0;
        for (int i = 0; i <= 10; i++) {
            while (count[i] > 0) {
                sorted[idx] = i;
                idx++;
                count[i]--;
            }
        }

        System.out.println("Input:  " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

}
