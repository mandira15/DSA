
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static String printTree(TreeNode root){
        if(root == null) return "null";
        String left = printTree(root.left);
        String right = printTree(root.right);
        return root.val + " -> (" + left + ", " + right + ")";
    }
}
