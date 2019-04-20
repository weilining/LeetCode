/**
 * Created by 韦师兄
 * 2019-04-20 21:13
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {

        int[] a = new int[A.length];
        int[] b = new int[A.length];
        int j = 0;
        for (int i = 0, k = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                a[j++] = A[i];
            } else {
                b[k++] = A[i];
            }
        }
        for (int i = 0; j < A.length; i++) {
            a[j++] = b[i];
        }
        return a;
    }

    public static void main(String[] args) {

        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] ints = sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4});
        System.out.println("yes");
    }
}
