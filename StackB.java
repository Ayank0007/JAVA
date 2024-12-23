public class StackB {
    static class Node{
        int value;
        Node next;
        Node(){};
        Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public static Node head;

    public boolean isEmpty(){
        return head == null;
    }
    public void push(int top){
        if (isEmpty()) {
            head=new Node(top);
            return;

            
        }
        Node newNode=new Node(top);
        newNode.next=head;
        head=newNode;
    }
    public int pop(){
        int top=head.value;
        head=head.next;
        return top;
    }
    public static void main(String[] args) {
        StackB s=new StackB();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
