import java.util.*;

public class StringRotation {
    public static boolean isSubstring(String s, String t) {
        
        int i = 0, j = 0, len = s.length(), count = 0;
        boolean found = false;

        while (i < s.length() && j < 2 * len) {
            if (found && s.charAt(i) != t.charAt(j % len)) {
                found = false;
                count = 0;
            }

            if (s.charAt(i) == t.charAt(j % len)) {
                found = true;
                count++; i++;
            }

            j++;
        }

        return count == len;
        

    }

    public static boolean isSubstr(String s, String t) {
        String s2 = s + s;
        return s2.contains(t);
    }

    public static boolean stringRotation(String s, String t) {
        if (s.length() != t.length()) return false;

        return isSubstring(s, t);
    }

    public static void main(String[] args) {
        String t = "erbottlewat";
        String s = "waterbottle";

        System.out.println(stringRotation(s, t));

        String t1 = "jaime";
        String t2 = "jenny";

        System.out.println(stringRotation(t1, t2));

        System.out.println(isSubstr(s, t));
    }
}
