package com.jacend.sort;

import java.util.Arrays;

/**
 * 冒泡排序的思想：
 * 每一轮选出一个最大的
 * 然后在剩下里面在选一个最大的
 * 选择的过程都是通过相互比较
 *
 *
 * 稳定的排序
 * 最好时间复杂度：o(n)
 * 平均时间复杂度：O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[]{13, 24, 12, 56, 67, 34, 11};
        bubbleSort(a, a.length );
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
