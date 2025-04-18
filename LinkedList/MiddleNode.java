package LinkedList;//Leetcode 876

import LinkedList.deleteNode.Node;

public class MiddleNode {
    public  static class linkedlist{
        Node head;
        Node tail;
        int size;
        linkedlist(){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        void insertAtbeginning(int val){
            Node temp=new Node(val);
            if(head==null) head=tail=temp;
            else{
                temp.next=head;
                head=temp;
            }
            size++;

        }
       void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
           tail.next=temp;
           tail=temp;
        }
        size++;
       }
        void insertAtindex(int idx,int val){
            Node temp=new Node(val);
            if(idx==0 ) insertAtbeginning(val);
            else if(idx==size) insertAtEnd(val);
            else{
                Node curr= head;
                for(int i=0;i<idx;i++){
                    curr=curr.next;
                }
                temp.next=curr.next;
                curr.next=temp;
                size++;
            }
        }
        public  static void print( Node a){
            System.out.println(a.val);
            if(a.next==null)return;
            
            print(a.next);
         }
    
    
    }
    public Node middleNode(Node head) {
        Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next!=null){//fast!=null is for odd case  && fast.next!=null for even case
       
        // if fast.next!=null will be written first it can give error as next of null is not defined so it is advised to write fast!=null first then fast.next!=null so that loop will break becoz of first condition and second condition will not be checked.
        slow=slow.next;
        fast=fast.next.next;
         // if fast is null then slow will be at the middle of the list
       }
       return slow;
    } 
    public Node leftmiddleNode(Node head) {
        Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next.next!=null){
       
        slow=slow.next;
        fast=fast.next.next;
      
       }
       return slow;
    } 
    
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtbeginning(1);
        ll.insertAtindex(1,2);
        ll.insertAtindex(2,3);
        ll.insertAtindex(3,4);
        ll.insertAtindex(4,5);
        ll.insertAtEnd(6);
       ll.print(ll.head);
        MiddleNode mn=new MiddleNode();
        Node ans=mn.middleNode(ll.head);
        System.out.println("Middle node is: "+ans.val);
        Node ans1=mn.leftmiddleNode(ll.head);
        System.out.println("Left middle node is: "+ans1.val);

       
    }
}
