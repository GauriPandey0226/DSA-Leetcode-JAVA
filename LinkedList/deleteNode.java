package LinkedList;//Leetcode 237

public class deleteNode {
    public  static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }

}
    public void deleteNode(Node node) {
        if(node==null || node.next==null) return;
        node.val=node.next.val;
        node.next=node.next.next;
    }


}
