package book.four;

import javax.swing.*;
import java.util.List;

public class Ti33 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    boolean recur(int[] postorder,int i,int j){
        if (i>=j)
            return true;
        int p=i;
        while (postorder[p]<postorder[j])
            p++;
        int m=p;
        while (postorder[p]>postorder[j])
            p++;
        return p==j&&recur(postorder,i,m-1)&&recur(postorder,m,j-1);

    }

    /*public void test(){
        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(6);
        TreeNode node3=new TreeNode(10);
        TreeNode node4=new TreeNode(5);
        TreeNode node5=new TreeNode(7);
        TreeNode node6=new TreeNode(9);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;

    }*/
}
