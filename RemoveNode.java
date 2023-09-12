package LinkedList;
import java.util.*;
// Define a ListNode class
class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNode {
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the head node itself has the value to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        // Value to be removed from the list
        int val = 6;

        // Create an instance of the RemoveNode class
        RemoveNode solution = new RemoveNode();

        // Call the removeElements method to remove nodes with the specified value
        ListNode result = solution.removeElements(head, val);

        // Print the modified linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
