package Week4;

import java.util.Arrays;

public class L153_findMin {
	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int ret = new L153_findMin().findMin1(nums);
		System.out.println(ret);
	}

	public int findMin(int[] nums) {
		Arrays.sort(nums);
		return nums[0];
	}

	public int findMin1(int[] nums) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int mid = left + ((right - left) >> 1);
			if (nums[mid] < nums[right])
				right = mid;
			else if (nums[mid] > nums[right])
				left = mid + 1;
			else {
				return nums[mid];
			}
		}
		return nums[left];
	}

}
