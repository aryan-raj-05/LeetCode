import java.util.ArrayList;
import java.util.List;

public class lc0144 {
    public List<Integer> preorderTraversal (TreeNode root) {
        // solved using recursion
        // will solve in iterative method later
        List<Integer> nums = new ArrayList<>();
        preorder(root, nums);
        return nums;
    }

    private void preorder(TreeNode root, List<Integer> nums) {
        if (root == null)       return;
        nums.add(root.val);
        preorder(root.left, nums);
        preorder(root.right, nums);
    }
}
