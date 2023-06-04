package LinkedList;

public class Iterative {
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
          System.out.println(temp.data + "->");
          temp = temp.next;
        }
        System.out.println("null");
      }
    
      public int itrSrch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
           if(temp.data == key){
            return i;
           }
           temp = temp.next;
           i++;
        }
        return -1;
      }
      public static void main(String[] args) {
        FullStruc ll = new FullStruc();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        System.out.println(ll.itrSrch(3));
      }



}

