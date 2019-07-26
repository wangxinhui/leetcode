package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: by simple on 2018/11/29.
 */
public class LongestWithoutRepeating {

    public static void main(String[] args) {
        getLongestStr("ss");
    }

    public static String getLongestStr(String str){
        int length = str.length();
        int ans = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= length; j++) {

            }
        }

        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("python");
            System.out.println(set.contains("java"));
        return null;
    }
}
