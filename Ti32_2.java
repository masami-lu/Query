package book.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ti32_2 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root!= null)
            queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            for (int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                tmp.add(node.val);
                if (node.left!=null)
                    queue.add(node.left);
                if (node.right!=null)
                    queue.add(node.right);
            }
            res.add(tmp);
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
        node5.right=node6;
        List<List<Integer>> result=levelOrder(node1);
        for (List list:result)
            System.out.println(list);*/

    }
}
