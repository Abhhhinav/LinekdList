package LinkedList;

public class ReverseLL {
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
    
      public void Rev(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
      }
      public static void main(String[] args) {
        ReverseLL ll = new ReverseLL ();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        ll.Rev();
        ll.display();
        
      }



}

