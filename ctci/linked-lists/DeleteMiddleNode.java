import java.util.*;

public class DeleteMiddleNode {
    public void deleteMiddleNode(Node root) {
        Node slow = root;
        Node fast = root;
        Node prev = null;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;
    }
}
