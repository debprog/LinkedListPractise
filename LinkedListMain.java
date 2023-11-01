import java.util.*;

class LinkedListdeba {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    void insertBegin(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void insertAtEnd(int new_node_data) {
        Node new_node = new Node(new_node_data);

        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;

    }

    void sortedInsert(int new_node_data) {
        Node new_node = new Node(new_node_data);

        if (head == null) { // case 1
            head = new_node;
            return;
        }

        if (new_node.data < head.data) { // case 2
            new_node.next = head;
            head = new_node;
            return;
        }

        Node current_node = head; // case 3
        while (current_node.next != null && new_node.data > current_node.next.data) {
            current_node = current_node.next; // correct pos a gelo
        }
        new_node.next = current_node.next;
        current_node.next = new_node;
    }

    void NthNodeFromEnd(int n) {
        Node slow_pointer = head;
        Node fast_pointer = head;

        for (int i = 1; i <= 3; i++) {
            fast_pointer = fast_pointer.next;
        }

        while (fast_pointer != null) {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next;
        }

        System.out.println(slow_pointer.data);
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print("-->");
            }
            node = node.next;
        }
        System.out.println();
    }

    void middleOfList() {
        Node slow_pointer = head;
        Node fast_pointer = head;
        int ct = 0;
        while (fast_pointer != null && fast_pointer.next != null) {
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
            ct++;
        }
        System.out.println("The Middle Element=" + "Node" + ct + "-->" + slow_pointer.data);
    }

    void iterativeReverse() {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (Node curr = head; curr != null; curr = curr.next) {
            arr.add(curr.data);
        }

        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = arr.remove(arr.size() - 1);
        }
    }

    void removeDuplicates() {

        Node currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;

            } else {
                currentNode = currentNode.next;

            }

        }

    }

    boolean checkPallindrome() {
        Stack<Integer> Stack_List_Items = new Stack<Integer>();

        for (Node currentNode = head; currentNode != null; currentNode = currentNode.next) {
            Stack_List_Items.push(currentNode.data);
        }

        for (Node currentNode = head; currentNode != null; currentNode = currentNode.next) {

            if (Stack_List_Items.pop() != currentNode.data) {
                return false;
            }
        }
        return true;
    }
}

public class LinkedListMain {

    public static void main(String args[]) {
        LinkedListdeba obj = new LinkedListdeba();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(20);
        obj.insertAtEnd(10);
        // obj.sortedInsert(90);
        // obj.sortedInsert(15);
        // obj.sortedInsert(15);
        // obj.sortedInsert(15);
        // obj.sortedInsert(90);
        obj.printList();
        // obj.middleOfList();
        // obj.NthNodeFromEnd(3);
        // obj.iterativeReverse();
        // obj.removeDuplicates();
        // obj.printList();
        boolean chk = obj.checkPallindrome();

        System.out.println(chk);

    }

}
