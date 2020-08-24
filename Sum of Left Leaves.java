class Solution {
   
public int sumOfLeftLeaves(TreeNode root) {
    TreeNode node = root;
    Stack<TreeNode> stack = new Stack<>();
    int sum = 0;
    while (node != null || !stack.isEmpty()) {
 
        while (node != null) {
            stack.push(node);
            if (node.left != null && node.left.left == null 
                && node.left.right == null) {
                sum += node.left.val;
            }
                node = node.left;
        }
 
        if (!stack.isEmpty()) {
            node = stack.pop().right;
        }
    }
    return sum;
}
}