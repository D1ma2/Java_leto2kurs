package Pract;
public class ListLink {
    private Node head;

    public ListLink() {
        head = null;
    }

    public class Node {
        public int godR;
        public Node Subsequent;

        public Node(int godR) {
            this.godR = godR;
            Subsequent = null;

        }
    }

    public void add(int godR) {
        Node newNode = new Node(godR);
        Node cerrentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (cerrentNode.Subsequent != null) {
                cerrentNode = cerrentNode.Subsequent;
            }
            cerrentNode.Subsequent = newNode;
        }
    }

    public void remove(int godR) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.Subsequent != null) {

            if (currentNode.godR == godR) {
                if (currentNode == head) {
                    head = currentNode.Subsequent;
                } else {
                    previousNode.Subsequent = currentNode.Subsequent;
                }

            }
            previousNode = currentNode;
            currentNode = currentNode.Subsequent;
        }
    }

    public void print() {
        Node currentNode = head;
        if (head != null) {
            System.out.println(head.godR);
        }
        while (currentNode.Subsequent != null) {
            currentNode = currentNode.Subsequent;
            System.out.println(currentNode.godR);
        }
    }
}

