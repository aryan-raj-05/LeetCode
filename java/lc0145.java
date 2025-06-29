import java.util.ArrayList;
import java.util.List;

public class lc0145 {
    // solved using recursion
    // will solve in iterative method later
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        postorder(root, nums);
        return nums;
    }

    private void postorder(TreeNode root, List<Integer> nums) {
        if (root == null)   return;
        postorder(root.left, nums);
        postorder(root.right, nums);
        nums.add(root.val);
    }
}
