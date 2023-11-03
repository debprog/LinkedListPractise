
class FindIntersectionPoint {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static void printlist(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -->");

            currentNode = currentNode.next;
        }
    }

    static void getIntersection(Node head, Node head1) {
        Node currentNode = head, currentNode1 = head, currentNode2 = head1;
        int l1 = 0, l2 = 0;

        while (currentNode != null) {
            l1++;
            currentNode = currentNode.next;
        }
        currentNode = head1;
        while (currentNode != null) {
            l2++;
            currentNode = currentNode.next;
        }
        int diff = Math.abs(l1 - l2);

        if (l1 > l2) {
            for (int i = 0; i < diff; i++) {
                currentNode1 = currentNode1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                currentNode2 = currentNode2.next;
            }
        }

        while (currentNode1 != null && currentNode2 != null)

        {
            if (currentNode1.next == currentNode2.next) {
                System.out.println("The Intersection Point Is " + currentNode1.next.data);
                return;
            }
        }

    }

    public static void main(String[] args) {
        FindIntersectionPoint obj1 = new Debayan();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);

        Node head1 = new Node(30);
        head1.next = head.next.next;
        printlist(head);
        System.out.println("\n");
        printlist(head1);
        System.out.println("\n");

        getIntersection(head, head1);

    }

}
