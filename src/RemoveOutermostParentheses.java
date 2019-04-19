import java.util.Stack;

/**
 * Created by 韦师兄
 * 2019-04-19 08:39
 * addr:https://leetcode.com/problems/remove-outermost-parentheses/
 * 1021. Remove Outermost Parentheses
 */
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {

        Stack a = new Stack();
        String str = new String();
        for (int i = 0; i < S.length(); i++) {
            if (a.empty()) {
                a.push(S.charAt(i));
            } else {
                if (S.charAt(i) == '(') {
                    a.push(S.charAt(i));
                    str += S.charAt(i);
                } else {
                    a.pop();
                    if (!a.empty()) {
                        str += S.charAt(i);
                    }
                }
            }
        }
        return str;

    }

    public static void main(String[] args) {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        System.out.println(removeOutermostParentheses.removeOuterParentheses("(()())(())"));
        System.out.println(removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOutermostParentheses.removeOuterParentheses("()()"));
    }
}
