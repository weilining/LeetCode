/**
 * Created by 韦师兄
 * 2019-04-21 12:26
 * https://leetcode.com/problems/non-decreasing-array/
 */
public class Non_DecreasingArray {
    public boolean checkPossibility(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i != 0 && i != nums.length - 2) {
                    if (nums[i - 1] <= nums[i + 1]) {
                        continue;
                    } else if (nums[i] <= nums[i + 2]) {
                        continue;
                    } else {
                        return false;
                    }

                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Non_DecreasingArray non_decreasingArray = new Non_DecreasingArray();

        boolean b = non_decreasingArray.checkPossibility(new int[]{4, 5, 2, 3});
        boolean b11 = non_decreasingArray.checkPossibility(new int[]{4, 2, 3});
        boolean b2 = non_decreasingArray.checkPossibility(new int[]{2, 3, 3, 2, 4});
//        boolean b1 = non_decreasingArray.checkPossibility(new int[]{1,4,5,3,6,7});
        System.out.println("accept");
    }
}
