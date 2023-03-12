package com.longluo.contest.weekly_contest_336;

/**
 * https://leetcode.cn/contest/weekly-contest-336
 */

/**
 * https://leetcode.cn/problems/count-the-number-of-beautiful-subarrays/
 */
public class Problem3 {

    // BF time: O(n^2) space: O(n)
    // TLE
    public static long beautifulSubarrays(int[] nums) {
        int len = nums.length;

        int ans = 0;

        int[] xors = new int[len + 1];

        for (int i = 0; i < len; i++) {
            xors[i + 1] = nums[i] ^ xors[i];
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (xors[j] == xors[i]) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("1 ?= " + beautifulSubarrays(new int[]{0}));
        System.out.println("0 ?= " + beautifulSubarrays(new int[]{1, 10, 4}));
        System.out.println("2 ?= " + beautifulSubarrays(new int[]{4, 3, 1, 2, 4}));
    }
}