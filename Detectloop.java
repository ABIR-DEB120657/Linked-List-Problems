class NODEBOX {
    int data;
    NODEBOX next;

    NODEBOX(int data) {
        this.data = data;
        this.next = null;
    }
}

// create a linked list class
class LinkedList {
    NODEBOX head;
    NODEBOX tail;
    int count;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    //value insert at linked list head
    void insertAthead(int value) {
        NODEBOX temp = head;
        NODEBOX newnode = new NODEBOX(value);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        } else {
            newnode.next = head;
            head = newnode;
        }
        count++;
    }

    //value insert at linked list tail
    void insertAttail(int value) {
        NODEBOX newnode = new NODEBOX(value);
        NODEBOX temp = head;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newnode;
//        tail = newnode; or
        else {
            tail.next = newnode;
            tail = newnode;
        }
        count++;
    }

    //Reverse a linked list (iterative)
    void reverselinkedList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        NODEBOX privious = null;
        NODEBOX current = head;
        NODEBOX next = null;
        tail = head;
        while (current != null) {
            next = current.next;
            current.next = privious;
            privious = current;
            current = next;
        }
        head = privious;
    }

    void findmiddlenode() {
        if (head == null) {
            System.out.println("List is empty");
        }
        NODEBOX fast = head;
        NODEBOX slow = head;
        //2nd middle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("2nd middle node is = " + slow.data);
        fast = head;
        slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("1st middle node is = " + slow.data);
    }

    void Detectloop() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        NODEBOX fast = head;
        NODEBOX slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                System.out.println("Detectloop is successful");
                return;
            }
        }
        System.out.println("Detectloop is failed");
    }

    void createloop(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        NODEBOX temp = head;
        NODEBOX loopnode = null;
        while (temp.next != null) {
            if (temp.data == value) {
                loopnode = temp;
            }
            temp = temp.next;
        }
        if (loopnode != null) {
            temp.next = loopnode; // tail -> loopNode
            System.out.println("Loop created at node with data = " + value);
        } else {
            System.out.println("node with value not found= " + value);
        }
    }

    //display function
    void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        NODEBOX slow = head;
        NODEBOX fast = head;
        NODEBOX temp = head;
        boolean loopexits = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                loopexits = true;
                break;
            }
        }
        if (loopexits) {
            slow = head;
            while (slow != fast) {
                System.out.println(slow.data + " ");
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println("loop starts at node with data = " + slow.data);
            System.out.println();
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class medium {
    public static void main(String[] args) {
        NODEBOX a = new NODEBOX(5);
        NODEBOX b = new NODEBOX(6);
        NODEBOX c = new NODEBOX(7);
        a.next = b;
        b.next = c;
        c.next = null;
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println("another method");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        LinkedList list1 = new LinkedList();
        System.out.println("create a linked list use insert head and tail ");
        System.out.print("insert head = ");
        list1.insertAthead(10);
        list1.insertAthead(11);
        list1.insertAthead(12);
        list1.insertAthead(13);
        list1.insertAthead(14);
        list1.display();
        System.out.print("insert at tail = ");
        list1.insertAttail(15);
        list1.insertAttail(16);
        list1.insertAttail(17);
        list1.insertAttail(18);
        list1.insertAttail(19);
        list1.insertAttail(20);
        list1.insertAttail(21);
        list1.display();
        System.out.println("tatal count is = " + list1.count);
        list1.reverselinkedList();//without use recursion use loop
        System.out.print("reverselinked list = ");
        list1.display();
        list1.findmiddlenode();
        list1.Detectloop();
        list1.createloop(17);
        list1.Detectloop();


    }
}
