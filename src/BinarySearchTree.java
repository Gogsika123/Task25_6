public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;
    public int getNumberOfLeaves() {
        return getNumberOfLeaves(root);
    }
    public int getNumberOfLeaves(TreeNode<E> node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftLeaves = getNumberOfLeaves(node.left);
        int rightLeaves = getNumberOfLeaves(node.right);
        return leftLeaves + rightLeaves;
    }
    class TreeNode<E> {
        E data;
        TreeNode<E> left;
        TreeNode<E> right;
        public TreeNode(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}

