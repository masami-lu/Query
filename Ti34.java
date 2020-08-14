package book.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ti34 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    void recur(TreeNode root, int sum) {
        if (root == null)
            return;

        path.add(root.val);
        sum = sum - root.val;
        if (sum==0&&root.left==null&&root.right==null)
            res.add(new LinkedList(path));
        recur(root.left,sum);
        recur(root.right,sum);
        path.removeLast();

    }


    public void test() {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        List<List<Integer>> result = pathSum(node1, 22);
        for (List list : result)
            System.out.println(list);
    }
}
