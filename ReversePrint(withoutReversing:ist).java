//NEW CLASS NODE1
class Node1 {
    int data;
    Node1 next;
    //CONSTRUCTOR
    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
    //NEW CLASS LINKED LIST
    class LinkedList1 {
        Node1 head;
        Node1 tail;
        int count;

        //CONSTRUCTOR
        LinkedList1() {
            this.head = null;
            this.tail = null;
            this.count = 0;
        }

        //INSERT AT TAIL FUNCTION
        void insertAthead(int value) {
            Node1 newnode = new Node1(value); // NEW NODE CREATE
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }
            count++;
        }

        //INSERT AT TAIL FUNCTION
        void insertAttail(int value2) {
            Node1 newnode = new Node1(value2); // NEW NODE CREATE
            if (head == null) {   // BASE CASE
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
            count++;
        }

        //  BOOLEAN SEARCHELEMENT FUNCTION
        boolean searchelement(int value3) {
            if (head == null) { // BASE CASE
                System.out.println("empty linked list");
                return false;
            } else {
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

        void insertAtSpecificPosition(int position, int value5) {
            Node1 newnode = new Node1(value5); //NEW NODE CREATE
            if (position < 1 || position > count + 1) {  // BASE CASE
                System.out.println("value is greater than count of linked list");
                return;
            }
            if (position == 1) {
                newnode.next = head;
                head = newnode;
                if (tail == null) {
                    tail = newnode;
                }
            } else {
                Node1 temp3 = head;
                for (int i = 1; i < position - 1; i++) {
                    temp3 = temp3.next;
                }
                newnode.next = temp3.next;
                temp3.next = newnode;
            }
            if (newnode.next == null) {
                tail = newnode;
            }
            count++;
        }

        void deleteFromHead() {
            if (head == null) {
                System.out.println("empty linked list");
                return;
            } else {
                head = head.next;
            }
            if (head == null) {
                tail = null;
            }
            count--;


        }

        //DELETE FROM TAIL
        void deleteFromTail() {
            Node1 temp10 = head;
            if (tail == null) {
                System.out.println("empty linked list");
                return;
            }
            if (head.next == null) {
                head = null;
                tail = null;
                count--;
                return;
            }
            while (temp10.next != tail) {
                temp10 = temp10.next;
            }
            temp10.next = null;
            tail = temp10;
            count--;
        }

        void DeleteaSpecificValue(int valueB) {
            if (head == null) {
                System.out.println("empty linked list");
                return;
            }
            if (head.data == valueB) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                count--;
                return;
            }
            Node1 temp11 = head;
            while (temp11.next != null && temp11.next.data != valueB) {
                temp11 = temp11.next;
            }
            if (temp11.next == null) {
                System.out.println("value not found");
                return;
            }
            temp11.next = temp11.next.next;
            if (temp11.next == null) {
                tail = temp11;
            }
            count--;
        }

        void deleteATPosition(int positionR) {
            if (head == null) {
                System.out.println("empty linked list");
                return;
            }
            if (positionR < 1 || positionR > count) {
                System.out.println("value not found");
                return;
            }
            if (positionR == 1) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                count--;
                return;
            }
            Node1 temp15 = head;
            for (int i = 1; i < positionR - 1; i++) {
                temp15 = temp15.next;
            }
//          Node1 temp15 = head;
//                int i = 1;
//            while(i<positionR-1){
//                temp15 = temp15.next;
//                i++;
//            }
            temp15.next = temp15.next.next;
            if (temp15.next == null) {
                tail = temp15;
            }
            count--;
        }

        void ReversePrint() {
            if (head == null) {
                System.out.println("empty linked list");
                return;
            }
            reverseCall(head);
            System.out.println(" ");
        }

        void reverseCall(Node1 node) {
            if (node == null) {
                return;
            }
            reverseCall(node.next);
            System.out.print(node.data + " ");
        }

    // DISPLAY FUNCTION
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
        newnode.deleteFromHead();
        newnode.display();
        System.out.println("again count number of nodes = "+newnode.count);
        newnode.deleteFromTail();
        newnode.display();
        System.out.println("again count number of nodes = "+newnode.count);
        newnode.DeleteaSpecificValue(100);
        newnode.display();
        System.out.println("again count number of nodes = "+newnode.count);
        newnode.deleteATPosition(2);
        newnode.display();
        System.out.println("again count number of nodes = "+newnode.count);
        System.out.print("reverse print = ");
        newnode.ReversePrint();
        System.out.print("normal print = ");
        newnode.display();
    }
}
