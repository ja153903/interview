import java.util.*;

public class RemoveDups {
    public Node removeDups(Node root) {
        Set<Integer> seen = new HashSet<>();
        Node copy = root;
        Node prev = null;
        while (copy != null) {
            if (!seen.contains(copy.val)) {
                seen.add(copy.val);
                prev = copy;
            } else {
                prev.next = copy.next;
            }
            copy = copy.next;
        }

        return root;
    }
}
