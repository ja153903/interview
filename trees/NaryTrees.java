import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class NaryTrees {
    public int val;
    public List<TreeNode> children;

}

class NaryTraversal {
    // Probably the most efficient way to iterate through an nary tree
    // since we can get screwed recursively
    public void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.println(cur.val);
            for (TreeNode child : cur.children) {
                q.offer(child);
            }
        }
    }
}
