package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: by simple on 2018/11/29.
 */
public class LongestWithoutRepeating {

    public static void main(String[] args) {

    }

    public static String getLongestStr(String str) {
        int length = str.length();
        int ans = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <= length; j++) {

            }
        }

        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("python");
        System.out.println(set.contains("java"));
        return null;
    }

    private boolean isSame(String s,int start,int end){
        Set<Character> set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (set.contains(c)){
                return false;
            }
        }
        return true;
    }


}
