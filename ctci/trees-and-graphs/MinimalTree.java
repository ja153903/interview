public class MinimalTree {
    public TreeNode minimalTree(int[] nums) {
        // we want to perform binary search on this array
        // which is how we're going to construct the tree
        return recursiveHelper(nums, 0, nums.length);
    }

    public TreeNode recursiveHelper(int[] nums, int lo, int hi) {
        if (lo >= hi) return null;

        int mid = (lo + hi) / 2;

        TreeNode current = new TreeNode(nums[mid]);

        current.left = recursiveHelper(nums, lo, mid-1);
        current.right = recursiveHelper(nums, mid+1, hi);

        return current;
    }
}
