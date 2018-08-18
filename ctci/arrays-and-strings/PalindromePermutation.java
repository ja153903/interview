import java.util.*;

public class PalindromePermutation {

    public boolean canBePalindrome(String s) {
        // Characteristics of a palindrome
        // if we have a palindrome, then we must have either an even count with 1 odd
        // or we have an even count with 0 odd
        int oddCount = 0;
        Map<Character, Integer> counter = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for (Map.Entry<Character, Integer> entry: counter.entrySet()) {
            if (entry.getValue() % 2 == 1) oddCount++;
        }

        return oddCount == 0 || oddCount == 1;
    }

    public boolean palindromePermutation(String s) {
        s = s.toLowerCase().replaceAll(" ", "");
        return canBePalindrome(s);
    }
}
