/**
 * Created by 韦师兄
 * 2019-04-21 03:19
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {

        int result =x^y;

        int count=0;
        while (result!=0){
            if(result%2==1){
                count++;
            }
            result/=2;

        }
//        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int i = hammingDistance.hammingDistance(1, 4);
        int i1 = hammingDistance.hammingDistance(93, 73);
//        73-1001001
//        93-1011101

        System.out.println("accept");

    }
}
