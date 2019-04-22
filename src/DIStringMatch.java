import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 韦师兄
 * 2019-04-22 13:57
 * https://leetcode.com/problems/di-string-match/submissions/
 */
public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int N = S.length() + 1;
        int[] A = new int[N];

        int I=0,D=S.length();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='I'){
                A[i]=I++;
            }else {
                A[i]=D--;
            }

        }
        A[N-1]=D;
        return A;
    }

    public static void main(String[] args) {
        DIStringMatch diStringMatch = new DIStringMatch();
        diStringMatch.diStringMatch("IDID");
        System.out.println("accept");
    }
}
