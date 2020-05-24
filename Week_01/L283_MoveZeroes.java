package Array;

public class L283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 0, 12};
        new L283_MoveZeroes().moveZeroes(nums);//{1,3,12,0,0}
    }

    // 4.swap
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }

    }

    // 3. index none-zero
    public void moveZeroes3(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    // 2. create a new array, i=0: none-zero, j=nums.length-1, zero
    public void moveZeroes2(int[] nums) {
        int[] newNums = new int[nums.length];
        int start = 0, end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newNums[start++] = nums[i];
            } else {
                newNums[end--] = nums[i];
            }
        }

    }

    // 1. count the nums of zeros, move none zeros
    public void moveZeroes1(int[] nums) {
        int zerosNum = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerosNum++;
            } else {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

}
