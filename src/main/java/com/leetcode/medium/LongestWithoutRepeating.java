package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: by simple on 2018/11/29.
 */
public class LongestWithoutRepeating {

    public static void main(String[] args) {
        System.out.println(getLongestStr("abcabcadec"));

    }

    public static int getLongestStr(String str) {
        int length = str.length();
        int ans = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <= length; j++) {
                if(isSame(str,i,j)) {
                    ans = Math.max(ans,j-i);
                    System.out.println(j);
                }
            }
        }

        return ans;
    }

    private static boolean isSame(String s,int start,int end){
        Set<Character> set = new HashSet();
        for (int i = start; i < end; i++) {
            Character c = s.charAt(i);
            if (set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }


}
