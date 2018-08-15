import java.util.*;

public class MapUseCases {
    public static void main(String[] args) {
        // HashMap
        // Runtime for get, put, contains: O(1)
        Map<Integer, Integer> hm = new HashMap<>();

        // TreeMap
        // We want to use this if we want to define a certain
        // ordering of the keys
        // Runtime for get, put, contains: O(lg n)
        Map<Integer, Integer> tm = new TreeMap<>();

        // LinkedHashMap
        // Want to use this if we care about the order
        // entries are inserted into the map
        // Runtime for get, put, contains: O(n)
        Map<Integer, Integer> lhm = new LinkedHashMap<>();
    }
}
