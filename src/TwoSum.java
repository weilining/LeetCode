/**
 * Created by 韦师兄
 * 2019-04-13 16:08
 */

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * SolutionL: j + i = i + j;
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i) {
                    if (nums[j] + nums[i] == target) {
                        int[] ints = {i, j};
                        return ints;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        TwoSum solution = new TwoSum();
        int[] ints = solution.twoSum(nums, target);

        for (int a : ints) {
            System.out.println(a);
        }
    }
}
