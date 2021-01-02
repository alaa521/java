/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abumansorsort;

/**
 *
 * @author alaa ahmed amer
 */
public class ShellSort {
        public static void shell_sort(int A[]) {
        int gap = A.length / 2;
        while (gap > 0) {
            for (int i = 0; i < gap; i++) helpInsertionSort(A, i, gap);
            gap /= 2;
        }
    }

    private static void helpInsertionSort(int[] A, int i, int gap) {
        for (int j = i + gap; j < A.length; j += gap) {
            int v = A[j], k = j - gap;
            while (k >= 0 && A[k] > v) {
                A[k + gap] = A[k];
                k -= gap;
            }
            A[k + gap] = v;
        }
    }
}
