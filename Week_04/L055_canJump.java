package Week4;

public class L055_canJump {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		boolean ret = new L055_canJump().canJump(nums);
		System.out.println(ret);
	}

	public boolean canJump(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;
		int endIndex = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] + i >= endIndex) {
				endIndex = i;
			}
		}
		return endIndex == 0;
	}

}
