package com.binarySearch;


/*
Ceiling of a target number is the minimum number greater than target
 */
public class CeilingOfNumber {

    public static void main(String[] args) {
        System.out.println(CeilingOfNumber.ceilingOfNum(new int[]{2,3,5,7}, 8));
    }

    private static int ceilingOfNum(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
