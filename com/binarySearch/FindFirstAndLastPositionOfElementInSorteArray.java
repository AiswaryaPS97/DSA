package com.binarySearch;

/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSorteArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[] {1,2,2,2,3,4,5}, 6)));
    }
    public static int[] searchRange(int[] nums, int target) {
        return new int[] {findIndex(nums,target,true), findIndex(nums, target, false)};
    }

    private static int findIndex(int[] nums, int target, boolean isFirstIndex){
        int start = 0;
        int end = nums.length-1;
        int index =-1;
        while( start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                index = mid;
                if(isFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else if(target < nums[mid]){
                end = mid -1;
            }else{
                start = start+1;
            }
        }
        return index;
    }

}
