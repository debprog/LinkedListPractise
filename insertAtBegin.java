package com.mycompany.mavenproject1;

class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

public class insertAtBegin {

    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);

        temp.next = head;
        return head;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head = insertBegin(head, 30);
        head = insertBegin(head, 50);
        head = insertBegin(head, 60);
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
