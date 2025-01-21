package org.example.Blind75PlayGround;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {



    public static void main(String[] args) {
        int target = 9;
        int []nums = {2,7,11,15};
        twoSum(nums, target);
    }

    static void twoSum(int[] nums, int target) {

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }



    }
}
