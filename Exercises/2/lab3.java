public class lab3<E> {
    Node head;

    public void insert(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
    }

    class Node {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}