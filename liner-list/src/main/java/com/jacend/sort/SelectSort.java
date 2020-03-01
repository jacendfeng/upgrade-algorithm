package com.jacend.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 也是分成无序，有序两个区域，
 * 但是每次选择最小的，放到有序区域的末尾，注意注意，千万要记得 找到最小的之后 元素位置也要交换
 *
 * 平均时间复杂度：O(n2)
 * 选择排序是不稳定的
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] a = new int[]{13, 24, 12, 56, 67, 34, 11};

        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int z = i;
            for (int j = i + 1; j < a.length ; j++) {
                if (a[j] < min) {
                    min = a[j];
                    z = j;
                }
            }
            a[z] = a[i];
            a[i] = min;

        }

        System.out.println(Arrays.toString(a));
    }
}
