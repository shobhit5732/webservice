package example;


class Node {

    Node next;
    int item;
    boolean visited;

    Node(int data) {
        this.next = null;
        this.item = data;
        this.visited = false;
    }
}

public class commonElementInLL {
    static Node head;
    static Node head1, head2;


    commonElementInLL() {
        head = null;
    }

    public static void main(String[] args) {


        commonElementInLL list = new commonElementInLL();
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(15);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);

        System.out.println("The node of intersection is " + list.getNode(head1, head2));

    }


    static void push(int ele)

    {
        Node current = new Node(ele);
        current.next = head;
        head = current;

    }

    static int getCount(Node node) {
        int count = 0;
        while (node.next != null) {
            count = count + 1;
            node = node.next;
        }
        return count;

    }

    int getNode(Node n1, Node n2) {
        int c1 = getCount(n1);
        int c2 = getCount(n2);

        if (c1 > c2) {

            return _getIntesectionNode(c1 - c2, n1, n2);

        } else {

            return _getIntesectionNode(c2 - c1, n2, n1);

        }
    }


    int _getIntesectionNode(int d, Node node1, Node node2) {
        int i;
        Node current1 = node1;
        Node current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.item == current2.item) {
                return current1.item;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }

}