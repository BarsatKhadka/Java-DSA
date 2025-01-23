package org.example.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        //to find first occurence go left by subtraccting end.
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if(arr[mid] == target) {
//                System.out.println(mid);
//                end = mid - 1;
//            }
//            if(arr[mid] < target) {
//                start = mid + 1;
//            }
//            if(arr[mid] > target) {
//                end = mid - 1;
//            }
//        }


    }
}
