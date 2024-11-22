package Problem0144_BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal (TreeNode root) {
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
