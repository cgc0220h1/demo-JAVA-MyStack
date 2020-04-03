public class MyStack<E> {
    public class Node<E> {
        public Node<E> next;
        public Node<E> previous;
        private E data;

        public Node(E data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

        public E getData() {
            return data;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int numNodes;

    public MyStack(){}

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public Node<E> get(int index) {
        if (head == null) {
            return null;
        }
        Node<E> current = head;
        for (int indexList = 0; indexList < index; indexList++) {
            current = current.next;
        }
        return current;
    }

    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            numNodes++;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        numNodes++;
    }

    public Node<E> pop() {
        if (head == null) {
            return null;
        }
        Node<E> node = tail;
        tail = tail.previous;
        return node;
    }
}
