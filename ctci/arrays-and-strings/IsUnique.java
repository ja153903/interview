import java.util.*;

public class IsUnique {
    // Here we have a solution using an additional data structure
    // In this case, we use a HashMap to record the instances
    // of the character
    public boolean isUnique(String s) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char c: s.toCharArray()) {
            if (counter.containsKey(c))
                return false;
            counter.put(c, 1);
        }

        return true;
    }

    public boolean isUniqueSet(String s) {
        Set<Character> hs = new HashSet<>();

        for (char c: s.toCharArray()) {
            if (hs.contains(c))
                return false;
            hs.add(c);
        }

        return true;
    }

    public boolean isUniqueConstantSpace(String s) {
        // to do this in constant space
        // our algorithm would have to suffer
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }

        return true;
    }
}
