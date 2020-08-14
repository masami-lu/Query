package book.four;

import book.three.Ti26;

public class Ti27 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp);
        return root;
    }
}
