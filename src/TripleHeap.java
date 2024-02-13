public class TripleHeap<T extends Comparable<T>> {

    // the heap's root
    private final TripleTreeNode<T> root;

    // an inner class, a tree implementation
    private static class TripleTreeNode<T> {
        // the branches
        private TripleTreeNode<T> leftNode;
        private TripleTreeNode<T> midNode;
        private TripleTreeNode<T> rightNode;
        // the value of the tree
        private T value;
    }
    // constructor
    public TripleHeap() {
        // set up the tree
        root = new TripleTreeNode<>();
    }
    // get the top of the heap
    public T peek() {
        return root.value;
    }

    
}
