package picsart.homeworks.lesson3.homeworks.task1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Bubble sort (analyze and implement bubble sort)
        int[] array = {5000, 300, 5, 77, 2 , 0, 33, 9, 12, 7, 200, 23};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j);
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }
}
