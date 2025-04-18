package LinkedList;// Leetcode 2095
import LinkedList.deleteNode.Node;
public class DeleteMiddle {
    class Solution {
        public Node deleteMiddle(Node head) {
               if (head == null || head.next == null) {
                return null;
            }
            Node slow=head;
            Node fast=head;
            Node prev=null;
    
             while(fast!=null&& fast.next!=null){
                prev=slow;
                slow=slow.next;
                 fast=fast.next.next;
             }
           prev.next=slow.next;
           return head;
           
        }
    }
    
}
