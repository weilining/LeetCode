import java.util.HashMap;
import java.util.Map;

/**
 * Created by 韦师兄
 * 2019-04-19 22:12
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {

        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < emails.length; i++) {
            String[] split = emails[i].split("@");
            String[] split1 = split[0].split("\\+");

//            String[] split2 = split[0].split(".");
//            System.out.println(split1[0]);

            String[] split2 = split1[0].split("\\.");
            String result="";
            for (String s : split2) {
//                System.out.println(s);
                result+=s;
            }
            result+="@";
            result+=split[1];
            System.out.println(result);
            map.put(result,i);
        }
        return map.size();
    }

    public static void main(String[] args) {
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        System.out.println(uniqueEmailAddresses.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
