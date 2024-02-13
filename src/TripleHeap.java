import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TripleHeap<T extends Comparable<T>> {

    // the heap's root
    private TripleTreeNode<T> root;

    // an inner class, a tree implementation
    private static class TripleTreeNode<T extends Comparable<T>> {
        // the branches
        private  TripleTreeNode<T> parentNode;
        private TripleTreeNode<T> leftNode;
        private TripleTreeNode<T> midNode;
        private TripleTreeNode<T> rightNode;
        // the value of the tree
        private final T value;
        public TripleTreeNode(T value) {
            this.value = value;
        }
        // level order traversal
        public ArrayList<TripleTreeNode<T>> levelOrderTraverse(TripleTreeNode<T> root) {
            // the queue for help
            Queue<TripleTreeNode<T>> queue = new LinkedList<>();
            queue.add(root);
            // the data
            ArrayList<TripleTreeNode<T>> data = new ArrayList<>();
            while (!queue.isEmpty()) {
                TripleTreeNode<T> node = queue.poll();
                data.add(node);
                if (node.leftNode != null) {
                    queue.offer(node.leftNode);
                }
                if (node.midNode != null) {
                    queue.offer((node.midNode));
                }
                if (node.rightNode != null) {
                    queue.offer(node.rightNode);
                }
            }
            return data;
        }
        // get the edge of the tree
        public TripleTreeNode<T> getEdge() {
            ArrayList<TripleTreeNode<T>> dataArray = levelOrderTraverse(this);
            // the last element is the edge
            return dataArray.get(dataArray.size() - 1);
        }
        // add method for the tree
        public void add(TripleTreeNode<T> node) {
            TripleTreeNode<T> edge = getEdge();

        }
        public TripleTreeNode<T> getParentNode(TripleTreeNode<T> node) {
            return node.parentNode;
        }
    }
    // constructor
    public TripleHeap() {
        // set up the tree
        root = new TripleTreeNode<>(null);
    }
    // get the top of the heap
    public T peek() {
        return root.value;
    }

    // check if the heap is empty
    public boolean isEmpty() {
        return root.value == null;
    }

    // insert method
    public void insert(T value) {
        if (value == null) {
            return;
        }
        // if the root is empty
        if (isEmpty()) {
            root = new TripleTreeNode<>(value);
            return;
        }
        // else
        TripleTreeNode<T> cur = root;
        TripleTreeNode<T> pre = null;
        while (cur != null) {
            pre = cur;

        }
    }

}
