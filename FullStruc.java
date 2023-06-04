package LinkedList;

public class FullStruc {
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

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;

  }

  public void add(int index, int data) {
    if (index == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int RemoveFirst() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int RemoveLast() {
    if (size == 0) {
      System.out.println("Ll is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    FullStruc ll = new FullStruc();
    ll.addFirst(1);
    ll.display();
    ll.addFirst(2);
    ll.display();
    ll.addFirst(3);
    ll.display();
    ll.addFirst(4);
    ll.display();
    ll.addFirst(5);
    ll.display();
    ll.add(3, 6);
    ll.display();
    ll.addLast(10);
    ll.display();
    System.out.println("Size of the array = "+ FullStruc.size);
    ll.RemoveFirst();
    ll.display();
    ll.RemoveLast();
    ll.display();
  }
}
