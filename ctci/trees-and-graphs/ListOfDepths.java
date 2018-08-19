import java.util.*;

public class ListOfDepths {
    public ArrayList<ArrayList<TreeNode>> listOfDepths(TreeNode root) {
        ArrayList<ArrayList<TreeNode>> nodes = new ArrayList<>();
        ArrayList<TreeNode> subList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current == null) {
                nodes.add(new ArrayList<>(subList));
                if (!q.isEmpty()) {
                    subList.clear();
                    q.offer(null);
                }
            } else {
                subList.add(current);

                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }    
        }

        return nodes;
    }
}
