
/**
 * Created by 韦师兄
 * 2019-04-22 20:36
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
class TreeNode {
    int val=0;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}
public class MergeTwoBinaryTrees {



    void T(TreeNode t, TreeNode t1, TreeNode t2) {
//        if (t1 == null && t2 == null) {
//            return;
//        }
//        TreeNode treeNode=new TreeNode(0);
//        if(t1==null){
//            treeNode.val = t2.val;
//            t=treeNode;
//            T(t.left,null,t2.left);
//            T(t.right,null,t2.right);
//        }else if(t2==null ){
//            treeNode.val = t1.val;
//            t=treeNode;
//            T(t.left,t1.left,null);
//            T(t.right,t1.right,null);
//        }else {
//            treeNode.val = t1.val+t2.val;
//            t=treeNode;
//            T(t.left, t1.left, t2.left);
//            T(t.right, t1.right, t2.right);
//        }



    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;

        TreeNode root=new TreeNode(t1.val+t2.val) ;

        root.left=mergeTrees(t1.left,t2.left);
        root.right=mergeTrees(t1.right,t2.right);
        return root;
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(3);
        t.right = new TreeNode(2);
        t.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);
        TreeNode treeNode = mergeTwoBinaryTrees.mergeTrees(t, t2);
        System.out.println("accept");

    }

}
