package LinkedList;

public class IntersectionNode {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node getIntersectionNode(Node headA, Node headB) {
       Node tempA=headA;
       Node  tempB=headB;
       int lenA = 0,lenB=0;
       while(tempA!=null){
              lenA++;
              tempA=tempA.next;
       }
       while(tempB!=null){
              lenB++;
             tempB=tempB.next;
         }
        tempA=headA;
         tempB=headB;
            if(lenA>lenB){
               for(int i=0;i<lenA-lenB;i++){
                   tempA=tempA.next;
                }
            }
            else if(lenB>lenA){
                for(int i=0;i<lenB-lenA;i++){
                    tempB=tempB.next;
                }
            }
            while(tempA!=tempB){
                tempA=tempA.next;
                tempB=tempB.next;
            }
            return tempA;
    }
    
}
