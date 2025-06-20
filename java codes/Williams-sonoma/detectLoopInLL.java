public class detectLoopInLL {
    static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean detectLoop(node head){
        if(head==null || head.next.next==null){
            return false;
        }
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        node head=new node(1);
        head.next = new node(2);
        head.next.next= new node(3);
        head.next.next.next= new node(4);
        head.next.next.next.next= head.next;

        System.out.println("Loop detected: " + detectLoop(head));
        
    }
}
