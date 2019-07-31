package com.leetcode.medium;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: by simple on 2018/11/29.
 */
public class LongestWithoutRepeating {

    public static void main(String[] args) {

//        System.out.println(getLongestStr("abcdefgacded"));

    }

    @Test
    public void test1(){
        int n = lengthOfLongestSubstring("2131hjfdhf32hjkfhsdjkf");
        System.out.println(n);
    }

//     -------------------method 01-------------------------
//    public static int getLongestStr(String str) {
//        int length = str.length();
//        int ans = 0;
//
//        for (int i = 0; i < length; i++) {
//            for (int j = i+1; j <= length; j++) {
//                if(isSame(str,i,j)) {
//                    ans = Math.max(ans,j-i);
//                }
//            }
//        }
//        return ans;
//    }

//    private static boolean isSame(String s,int start,int end){
//        Set<Character> set = new HashSet();
//        for (int i = start; i < end; i++) {
//            Character c = s.charAt(i);
//            if (set.contains(c)){
//                return false;
//            }
//            set.add(c);
//        }
//        return true;
//    }
//    -------------------method 01-------------------------

    public int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int ans = 0,i=0,j=0;
        int n = s.length();
        while (i<n && j<n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}
