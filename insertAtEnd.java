package com.mycompany.mavenproject1;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class insertAtEnd {

    static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);

        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head = insertEnd(head, 30);
        head = insertEnd(head, 50);
        head = insertEnd(head, 60);
        System.out.println(head.data);
        printList(head);

    }

    public static void printList(Node head) {
        // Node curr = head;
        // while (curr != null) {
        // System.out.print(curr.data + "-->");
        // curr = curr.next;
    }

}
