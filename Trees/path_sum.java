public class path_sum {
    public boolean inOrder(TreeNode root , int sum, int targetSum){
        sum += root.val;
        if(root.left == null && root.right == null){
            if(sum == targetSum) return true;
            return false;
        }
        boolean leftSide = inOrder(root.left, sum , targetSum);
        boolean rightSide = inOrder(root.right, sum, targetSum);
        return leftSide || rightSide;
    }
    public boolean pathSum(TreeNode root, int targetSum){
        if(root == null) return false;
        int sum = 0;
        return inOrder(root, sum, targetSum);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int targetSum = 7;
        path_sum ps = new path_sum();
        System.out.println(ps.pathSum(root, targetSum));
    }
}
