package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] res = {1, 3, 5, 78, 9, 6, 4};
        int[] s = resultNums(res,10);
        System.out.println(s);

    }
    public static int[] resultNums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
