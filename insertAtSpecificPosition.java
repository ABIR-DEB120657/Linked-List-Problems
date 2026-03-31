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
        int count;
        LinkedList1(){
            this.head = null;
            this.tail = null;
            this.count = 0;
        }
    void insertAthead(int value){
        Node1 newnode = new Node1(value);
        if(head == null) {
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        count++;
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
            count++;
    }
    boolean searchelement(int value3){
            if(head == null){
                System.out.println("empty linked list");
                return false;
            }
            else {
                Node1 temp2 = head;
                while (temp2 != null) {
                    if (temp2.data == value3) {
                        return true;
                    }
                    temp2 = temp2.next;
                }
            }
            return false;
    }
    void insertAtSpecificPosition(int position ,int value5){
            Node1 newnode = new Node1(value5);
            if(position < 1 ||  position > count){
                System.out.println("value is greater than count of linked list");
                return;
            }
            if(position == 1){
                newnode.next = head;
                head = newnode;
                if(tail == null){
                    tail = newnode;
                }
            }
            else{
                Node1 temp3 = head;
                for (int i = 1; i < position - 1; i++) {
                    temp3 = temp3.next;
                }
                    newnode.next = temp3.next;
                    temp3.next = newnode;
            }
            if(newnode == null){
                tail = newnode;
            }
            count++;
    }
    void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node1 tempA = head;
        while (tempA != null){
            System.out.print(tempA.data+" ");
            tempA= tempA.next;
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
        System.out.print("count number of nodes = "+newnode.count);
        System.out.println(" ");
        System.out.println("search element 40 = "+newnode.searchelement(40));
        System.out.println("search element 50 = "+newnode.searchelement(50));
        System.out.println("search element 60 = "+newnode.searchelement(60));
        System.out.println("search element 70 = "+newnode.searchelement(70));
        System.out.println("search element 10 = "+newnode.searchelement(10));
        System.out.println("search element 20 = "+newnode.searchelement(20));
        System.out.println("search element 30 = "+newnode.searchelement(30));
        newnode.insertAtSpecificPosition(4,100);
        newnode.display();
        System.out.println("Again count number of nodes = "+newnode.count);
    }
}
