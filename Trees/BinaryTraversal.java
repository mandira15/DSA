import java.lang.*;
import java.util.*;
public class BinaryTraversal {
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
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>(); //for storing level order traversal
        List<List<Integer>> ans = new ArrayList<>(); //for storing final answer
        if(root == null) return ans; //handling edge cases
        q.offer(root); // substitute the root
        while(!q.isEmpty()){
            List<Integer> subList = new ArrayList<>(); //for storing current level nodes
            int level = q.size(); //number of nodes in current level
            for(int i = 0; i < level; i++){ //for loop for traversing the nodes at every level
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                subList.add(q.poll().val); //add element to sublist and remove it from queue
            }
            ans.add(subList); //add sublist to final answer
        }
        return ans; //return final answer
    }
    public static void main(String[] args){
        BinaryTraversal bt = new BinaryTraversal();
        TreeNode root = bt.new TreeNode(1);
        root.left = bt.new TreeNode(2);
        root.right = bt.new TreeNode(3);
        root.left.left = bt.new TreeNode(4);
        root.left.right = bt.new TreeNode(5);
        List<List<Integer>> result = bt.levelOrder(root);
        System.out.println(result); // Output: [[1], [2, 3], [4, 5]]
    }
}
