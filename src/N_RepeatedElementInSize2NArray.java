import java.util.HashMap;
import java.util.Map;

/**
 * Created by 韦师兄
 * 2019-04-20 20:43
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class N_RepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if(map.get(A[i]) ==null){
                map.put(A[i],1);
            }else {
                return A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        N_RepeatedElementInSize2NArray n_repeatedElementInSize2NArray = new N_RepeatedElementInSize2NArray();
        System.out.println(n_repeatedElementInSize2NArray.repeatedNTimes(new int[]{1,2,3,3}));
    }
}
