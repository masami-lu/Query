package book.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ti32_1 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            ans.add(node.val);
            if (node.left!=null)
                queue.add(node.left);
            if (node.right!=null)
                queue.add(node.right);

        }
        int[] res=new int[ans.size()];
        for (int i=0;i<ans.size();i++) {
            res[i] = ans.get(i);
        }
        return res;

    }

    public void test(){
        /*TreeNode node1=new TreeNode(3);
        TreeNode node2=new TreeNode(9);
        TreeNode node3=new TreeNode(2);
        TreeNode node4=new TreeNode(1);
        TreeNode node5=new TreeNode(7);
        TreeNode node6=new TreeNode(5);
        node1.left=node2;
        node1.right=node3;
        node3.left=node4;
        node3.right=node5;
        node5.right=node6;*/
        TreeNode node1=null;
        int[] result=levelOrder(node1);
        for (int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }

    }
}
