package LinkedList;

public class nthEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Delete(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;//remove First
            return;
        }
        
        //size-n
        int i = 1;
        int itoF = size-n;
        Node prev = head;
        while(i < itoF){
          prev = prev.next;
          i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        nthEnd ll = new nthEnd ();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        ll.Delete(3);
        ll.display();

    }
}
