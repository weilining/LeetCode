import java.io.File;

/**
 * Created by 韦师兄
 * 2019-04-20 22:11
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            for (int i1 = 0; i1 < A[i].length / 2; i1++) {
                int temp = A[i][i1];
                A[i][i1] = A[i][A[i].length - i1 - 1];
                A[i][A[i].length - i1 - 1] = temp;
            }
            for (int i1 = 0; i1 < A[i].length; i1++) {
                A[i][i1]=A[i][i1]==0?1:0;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        int[][] ints = flippingAnImage.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        System.out.println("accept");
    }
}
