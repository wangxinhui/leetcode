package com.leetcode.easy;

/**
 * @Author: by simple on 2018/10/11.
 */
public class ReversesInteger {

    public static void main(String[] args) {
        int a = 1534236469;
        int res = 0;
        while (a!=0){
            int temp = res*10 + a%10;
            a /=10;
            if (temp/10!=res){
                res = 0;
                break;
            }
            res= temp;
        }
        System.out.println(res);
    }
}
