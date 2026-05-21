public class invert_binary_tree {
    public TreeNode invertTree(TreeNode root){
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(TreeNode.printTree(root));
        invert_binary_tree obj = new invert_binary_tree();
        TreeNode result = obj.invertTree(root);
        System.out.println(TreeNode.printTree(result));
    }
}
