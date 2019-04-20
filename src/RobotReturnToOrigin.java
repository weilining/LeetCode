import java.util.HashMap;
import java.util.Map;

/**
 * Created by 韦师兄
 * 2019-04-20 22:31
 * https://leetcode.com/problems/robot-return-to-origin/
 */
public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int sum = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                sum += 1;
            } else if (moves.charAt(i) == 'D') {
                sum += -1;
            }
        }
        if (sum != 0) {
            return false;
        }
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                sum += 1;
            } else if (moves.charAt(i) == 'R') {
                sum += -1;
            }
        }
        if (sum != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();
        boolean ud = robotReturnToOrigin.judgeCircle("UD");
        boolean ud1 = robotReturnToOrigin.judgeCircle("LL");
        System.out.println("accept");
    }
}
