/**
 * Created by 韦师兄
 * 2019-04-19 08:17
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String s = x+"";
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n/2; i++) {
            if(chars[i] != chars[n-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(10));
    }
}
