package LinkedList;

public class SwappingNodes {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node swapNodes(Node head, int k) {
        Node first=head;
        Node slow=head;
        Node fast= head;
        for(int i=1;i<k;i++){
            first=first.next;
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp=slow.val;
        slow.val=first.val;
        first.val=temp;
        return head;
    }
    
}
