/**
 * Created by 韦师兄
 * 2019-04-19 08:34
 * addr:https://leetcode.com/problems/jewels-and-stones/
 * 771. Jewels and Stones
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int i1 = 0; i1 < J.length(); i1++) {
                if(J.charAt(i1) == S.charAt(i)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones("aA","aAAbbbb"));
        System.out.println(jewelsAndStones.numJewelsInStones("z","ZZ"));
    }
}
