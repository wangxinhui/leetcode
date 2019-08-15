package com.leetcode.hard;

import org.junit.Test;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] temp = new int[num1.length + num2.length];
        int index = 0;
        int n = 0, m = 0;
        int tempa = 0;
        int tempb = 0;
        while (n < num1.length || m < num2.length) {
            if (n < num1.length) {
                tempa = num1[n];
            }
            if (m < num2.length) {
                tempb = num2[m];
            }

            if (n==num1.length || m == num2.length){
                if (n < num1.length) {
                    temp[index] = tempa;
                    n++;
                }
                if (m < num2.length) {
                    temp[index] = tempb;
                    m++;
                }
            }else{
                if (tempa > tempb) {
                    temp[index] = tempb;
                    m++;
                } else {
                    temp[index] = tempa;
                    n++;
                }
            }

            index++;
        }

        if (temp.length % 2 == 0) {
            return (temp[temp.length / 2] + temp[temp.length / 2 - 1]) / 2.0;
        } else {
            return temp[temp.length / 2];
        }
    }

    @Test
    public void test1(){
        int[] a = {1,2};
        int[] b ={3,4};
        double dd = findMedianSortedArrays(a,b);
        System.out.println(dd);
    }
}

