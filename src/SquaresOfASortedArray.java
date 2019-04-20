import java.util.Arrays;

/**
 * Created by 韦师兄
 * 2019-04-20 21:29
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] ints = squaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println("accept");
    }
}
