import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 韦师兄
 * 2019-04-19 19:32
 * addr: https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {

        String[] s = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        String[] str = new String[words.length];
        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
            str[i] = "";
            for (int j = 0; j < words[i].length(); j++) {
//                System.out.println((int)words[i].charAt(j)-96);
                str[i] += s[(int) words[i].charAt(j) - 96 - 1];
            }

//            System.out.println(str[i]);
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i1 = 0; i1 < str.length; i1++) {
            map.put(str[i1], i1);
        }
        return map.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        System.out.println(uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
