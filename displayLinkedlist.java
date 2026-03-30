class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
    class LinkedList1{
        Node1 head;
        Node1 tail;
        LinkedList1(){
            this.head = null;
            this.tail = null;
        }
    void insertAthead(int value1){
        Node1 temp = head;
        Node1 newnode = new Node1(value1);
        if(head == null) {
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    void insertAttail(int value2){
            Node1 newnode = new Node1(value2);
            if(head == null) {
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail= newnode;
            }


    }
    void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node1 temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp= temp.next;

        }
        System.out.println(" ");

    }


}
public class createnode {
    public static void main(String[] args) {
        Node1 a = new Node1(10);
        Node1 b = new Node1(20);
        Node1 c = new Node1(30);
        Node1 d = new Node1(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.print("normal way data print = ");
        System.out.print(a.data+" ");
        System.out.print(b.data+" ");
        System.out.print(c.data+" ");
        System.out.print(d.data+" ");
        System.out.println(" ");
        System.out.println("or");
        System.out.print("next way use data print = ");
        System.out.print(a.data+" ");
        System.out.print(a.next.data+" ");
        System.out.print(a.next.next.data+" ");
        System.out.print(a.next.next.next.data+" ");
        System.out.println(" ");
        System.out.print("insert at head = ");
        LinkedList1 newnode = new LinkedList1();
        newnode.insertAthead(10);
        newnode.insertAthead(20);
        newnode.insertAthead(30);
        newnode.display();
        System.out.print("insert at tail = ");
        newnode.insertAttail(40);
        newnode.insertAttail(50);
        newnode.insertAttail(60);
        newnode.insertAttail(70);
        newnode.display();
        System.out.print("display linked list = ");
        newnode.display();

    }


}
