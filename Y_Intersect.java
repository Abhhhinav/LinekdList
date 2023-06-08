package LinkedList;

public class Y_Intersect {
    
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
      public Node Intersect(Node head1,Node head2){
        while(head2 != null){
          Node temp = head1;
          while(temp != null){
             if(temp == head2){
                return head2;
             }
             temp = temp.next;
          }
          head2 = head2.next;
        }
        return null;
      }
      public static void main(String[] args) {
        Y_Intersect y = new Y_Intersect();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        
      }
  } 

