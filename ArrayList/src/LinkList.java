public class LinkList<T> implements ICollection<T> {
    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    public LinkList() {
        lastNode = new Node(null, firstNode, null);
        firstNode = new Node(null, null, lastNode);
    }

    @Override
    public void add(T item) {
        Node prev = lastNode;
        prev.item = item;
        lastNode = new Node(null, prev, null);
        prev.item = lastNode;
        size++;
    }

    @Override
    public boolean add(int index, T item) {
        if (index < 0 || index > size) {
            return false;
        }
        return false;
    }

    @Override
    public boolean contains(T s) {
        Node current = firstNode;

        if (s == null) {
            return false;
        }

        while (current.prev != null) {
            if (current.item.equals(s)) {
                return true;
            } else {
                current = current.next;
            } 
        }
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(T searchKey) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }


    private class Node<T> {
         T item;
         Node<T> next;
         Node<T> prev;

        public Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }
}

