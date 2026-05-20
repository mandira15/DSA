import java.util.*;

public class binary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        // using bfs
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            //traversing level by level
            for(int i = 0; i < size; i ++){
                TreeNode curr = q.poll(); //adding values from queue by poping them up
                level.add(curr.val);
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            res.add(level);
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        binary_tree_level_order_traversal obj = new binary_tree_level_order_traversal();

        System.out.println(obj.levelOrder(root));
    }
}
