/**
 * Created by 韦师兄
 * 2019-04-19 07:29
 */
public class ReverseInteger {
    public int reverse(int x) {

        String s = x + "";
        char[] array = s.toCharArray();
        int n = array.length;
        if (array[0] == '-') {
            for (int i = 1; i < (n-1)/2+1; i++) {

                char temp = array[i];
                array[i]=array[n-i];
                array[n-i] = temp;

            }
        } else {

            for (int i = 0; i < n/2; i++) {

                char temp = array[i];
                array[i]=array[n-i-1];
                array[n-i-1] = temp;

            }
        }
        String str = String.valueOf(array);
        try{
            int result= Integer.parseInt(str);
            return result;
        } catch (Exception e){
            return 0;
        }

//        long result = Integer.parseInt(str);
//        System.out.println(result);


    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-123));
    }
}
