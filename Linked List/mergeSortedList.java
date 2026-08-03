public class mergeSortedList {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node mergeTwoList(Node List1 ,Node List2){
        Node ans = null;
        if(List1 == null){
            return List2;
        }
        if(List2 == null){
            return List1;
        }
        if(List1.val < List2.val){
            ans = List1;
            ans.next = mergeTwoList(List1.next , List2);
        }else{
            ans = List2;
            ans.next = mergeTwoList(List1, List2.next);
        }
        return ans;
    }
}
