import java.util.Arrays;

public class CheckPermutation {
    // Notice that we need to check for base cases now
    public boolean isPerm(String s, String t) {
        if (s.length() == t.length()) return true;
        if (s.length() == 0) return false;
        if (t.length() == 0) return false;

        s = s.replaceAll(" ", "");
        t = t.replaceAll(" ", "");

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        return sarr.equals(tarr);
    }
}
