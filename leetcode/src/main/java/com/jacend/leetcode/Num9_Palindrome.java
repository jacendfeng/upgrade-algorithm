package com.jacend.leetcode;

/**
 * 判断一个整数是否是回文数
 */
public class Num9_Palindrome {

    // 第一种思路，是转换为字符串，反转后进行比较
    public boolean isPalindrome(int x) {
        char[] chars  = Integer.toString(x).toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length-i-1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        return sb.equals(sb.reverse());
    }

    // 第二种思路，
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;

        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;

            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
