import java.util.Queue;
import java.util.LinkedList;

public class TreeTraversals {
    public static void INORDER(TreeNode root) {
        INORDER(root.left);
        System.out.println(root.val);
        INORDER(root.right);
    }

    public static void PREORDER(TreeNode root) {
        System.out.println(root.val);
        PREORDER(root.left);
        PREORDER(root.right);
    }

    public static void POSTORDER(TreeNode root) {
        POSTORDER(root.left);
        POSTORDER(root.right);
        System.out.println(root.val);
    }

    public static void LEVELORDER(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.println(cur.val);
            if (cur.left != null)
                q.offer(cur.left);
            if (cur.right != null)
                q.offer(cur.right);
        }
    }
}
