package com.mycompany.helloworld;

/**
 * Author: zhao han
 * Email: zhxhfq@gmail.com
 * Date: 17/6/4
 */

public class LeetCode4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        int max = Math.max(nums1.length, nums2.length);

        if(len % 2 == 0){

            return 0.;
        }

        int medianLoc = len / 2;
        int index = -1;
        int nums1flag = 0;
        int nums2flag = 0;
        double median;
        for(int i = nums1flag; i < nums1.length; i ++){
            nums1flag = i;

            for(int j = nums2flag; j < nums2.length; j ++){
                nums2flag = j;
                index ++;

                if(nums1[nums1flag] < nums2[nums2flag]){
                    median = nums1[nums1flag];
                    if(index == medianLoc) return median;
                    System.out.println(index + ":" + nums1[nums1flag]);
                    break;
                }else{
                    median = nums2[nums2flag];
                    if(index == medianLoc) return median;
                    System.out.println(index + ":" + nums2[nums2flag]);
                }

            }

        }

        return 0.;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,7,8};
//        int[] nums1 = {1};
        int[] nums2 = {4,5,6,10,11,12};
//        int[] nums2 = {1};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
