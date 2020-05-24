package Array;

import java.util.HashMap;
import java.util.Map;

public class L001_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 100;
        int[] ret = new L001_TwoSum().twoSum(nums, target);
        System.out.println(ret);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];
            if (map.containsKey(toFind)) {
                return new int[]{map.get(toFind), i};
            }
            map.put(nums[i], i);

        }

        return new int[2];
    }
}
