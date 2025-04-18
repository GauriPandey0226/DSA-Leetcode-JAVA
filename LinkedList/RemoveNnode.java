package LinkedList;
import LinkedList.deleteNode.Node;
public class RemoveNnode {
    public Node RemoveNnode(Node head, int n) {
        Node fast = head;
        Node slow = head;
        Node prev = null;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            prev = slow; // to keep track of the previous node from node to be deleted
            slow = slow.next;
            fast = fast.next;
        }
        if (prev == null)// n== length of linkedlist
         {
            return head.next;
        } else {
            prev.next = slow.next;
            return head;
        }
    }
    
}
