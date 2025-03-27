package com.binarySearch;

/*
Floor of a target number is the maximum number less than target
*/
public class FloorOfNumber {
    public static void main(String[] args) {
        System.out.println(FloorOfNumber.floorOfNumber(new int[]{2,3,5,7}, 8));
    }

    private static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
