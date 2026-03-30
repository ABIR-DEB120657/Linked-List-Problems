class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
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
        System.out.print(a.data+" ");
        System.out.print(a.next.data+" ");
        System.out.print(a.next.next.data+" ");
        System.out.print(a.next.next.next.data+" ");
    }


}
