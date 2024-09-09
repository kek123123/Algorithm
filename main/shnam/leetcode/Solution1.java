package main.shnam.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.twoSum(new int[]{2, 5, 5, 11}, 10);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        AtomicInteger idx = new AtomicInteger();
        Arrays.stream(nums).forEach(num -> {
            List<Integer> list = map.getOrDefault(num, new ArrayList<>());
            list.add(idx.getAndIncrement());
            map.put(num, list);
        });
        Arrays.sort(nums);
        int lt = 0;
        int rt = 1;
        int sum = 0;

        while (sum != target) {
            sum = nums[lt] + nums[rt];
            if (sum < target && rt < nums.length - 1) {
                rt++;
            } else if (sum > target || sum != target) {
                lt++;
                if (lt == rt) rt++;
            }
        }

        if (map.get(nums[lt]).size() > 1) {
            return new int[]{map.get(nums[lt]).get(0), map.get(nums[rt]).get(1)};
        }

        return new int[]{map.get(nums[lt]).get(0), map.get(nums[rt]).get(0)};
    }
}
