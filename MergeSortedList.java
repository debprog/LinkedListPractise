import java.util.*;

class LinkedListdeb {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
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

}

public class MergeSortedList {

    public static void main(String args[]) {
        LinkedListdeb obj = new LinkedListdeb();
        LinkedListdeb obj1 = new LinkedListdeb();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);

        obj1.insertAtEnd(11);
        obj1.insertAtEnd(21);
        obj1.insertAtEnd(29);

        obj.printList();
        obj1.printList();

        System.out.println(obj.head.data);
        System.out.println(obj1.head.data);

    }

}
