public class KthToLast {
    public Node kthToLast(Node root, int k) {
        Node fast = root;
        Node slow = root;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;

    }
}
