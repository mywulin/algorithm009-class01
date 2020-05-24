package Array;

import java.util.*;

public class L015_ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {1, 2, -2, -1};
        List<List<Integer>> ret = new L015_ThreeSum().threeSum(nums);
        System.out.println(ret);//{{-1, 0, 1},  {-1, -1, 2}}
    }

    // 3. 左右夹逼
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }
            }
        }
        return new ArrayList<>(set);

    }

    // 2. hash 超时
    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            Map<Integer, Integer> map = new HashMap<>(nums.length - i);
            for (int j = i + 1; j < nums.length; j++) {
                int v = target - nums[j];
                if (map.containsKey(v)) {
                    List<Integer> value = Arrays.asList(nums[i], nums[j], v);
                    value.sort(Comparator.naturalOrder());
                    set.add(value);
                }
                map.put(nums[j], nums[j]);

            }
        }
        return new ArrayList<>(set);
    }

    // 1.  3重循环 -> 超时
    public List<List<Integer>> threeSum1(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);
                        set.add(value);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
