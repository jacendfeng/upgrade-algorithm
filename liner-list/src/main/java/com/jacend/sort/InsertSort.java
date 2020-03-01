package com.jacend.sort;

import java.util.Arrays;

/**
 * 插入排序的思想，
 * 分成有序的，和无序的两部分
 * 将无序的中取数，依次比较插入到有序的里面（涉及到元素要挪动）
 *
 * 稳定的排序
 * 最好时间复杂度：o(n)
 * 平均时间复杂度：O(n^2)
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = new int[]{13, 24, 12, 56, 67, 34, 11};
        insertSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int[] a, int n) {
        // 从第二个元素开始，把左边当成有序的开始插入
        for (int i = 1; i < n; i++) {
            // 拎出想要插入的元素
            int current = a[i];
            int j = i - 1;
            for(; j >=0; j--) { // 从有序的最后一个开始比较
                if (a[j] > current) { // 如果比 current 大，则依次往后挪，或者有不满足条件的则 break, 就能得到要插入的位置了
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = current;
        }
    }
}
