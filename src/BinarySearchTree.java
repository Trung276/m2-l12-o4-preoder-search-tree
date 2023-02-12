public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }
    public static void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
}