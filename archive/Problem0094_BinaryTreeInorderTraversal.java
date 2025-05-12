import java.util.ArrayList;
import java.util.List;

public class Problem0094_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        // solved using recursion
        // will solve in iterative method later
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> l) {
        if (root == null)       return;
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }
}
