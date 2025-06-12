package org.example.example1;
import java.util.Arrays;

// Замена медленных алгоритмов на более эффективные
public class Main1 {
    public static int findMax(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        // в этом случае алгоритм работает со сложностью O(n) - медленно
        /*
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
         */

        // улучшаем - сначала проведем сортировку (алгоритм сортировки гораздо быстрее O(log(n)):
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 3, 15, 9, 20};
        System.out.println("Max element: " + findMax(array));
    }
}

