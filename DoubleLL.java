package LinkedList;

public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
    
        public Node(int data) {
          this.data = data;
          this.next = null;
          this.prev = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;
        
        public void Add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            head.prev = newNode;
        }
        public int RemoveFirst(){
            if(head == null){
                System.out.println("Dll is empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head = tail =null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
              System.out.print(temp.data + "<->");
              temp = temp.next;
            }
            System.out.println("null");
          
        }    
    public static void main(String[] args) {
        DoubleLL dl = new DoubleLL();
        dl.Add(4);
        dl.Add(3);
        dl.Add(2);
        dl.Add(1);
        dl.display();
        dl.RemoveFirst();
        dl.display();
    }
}
