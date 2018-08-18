import java.util.*;

public class OneAway {

    public Map<Character, Integer> letterCounter(String s, String t) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char c: s.toCharArray())
            counter.put(c, counter.getOrDefault(c, 0)+1);
        for (char c: t.toCharArray())
            counter.put(c, counter.getOrDefault(c, 0)+1);

        return counter;
    }

    public int getOddCount(String s, String t) {
        Map<Character, Integer> counter = letterCounter(s, t);
        int oddCount = 0;

        for (int value: counter.values()) {
            if (value % 2 == 1) oddCount++;
        }

        return oddCount;
    }

    public boolean canRemoveOrInsert(String s, String t) {
        if (t.length() == s.length()) return false;
        
        int oddCount = getOddCount(s, t);
        
        return oddCount <= 1;
    }

    public boolean canReplace(String s, String t) {
        if (s.length() < t.length() || s.length() > t.length())
            return false;

        int oddCount = getOddCount(s, t);

        return oddCount == 2;
    }

    public boolean oneAway(String s, String t) {
        if (Math.abs(s.length() - t.length()) > 1)
            return false;
        
        if (s.equals(t)) return true;

        return canRemoveOrInsert(s, t) || canReplace(s, t);

    }
}
