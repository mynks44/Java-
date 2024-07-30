public class Mainnn {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the given tree:");
        bst.inorder();

        System.out.println("\n\nSearch for node 40:");
        System.out.println(bst.search(40) ? "Node found" : "Node not found");

        System.out.println("\nDelete node 20:");
        bst.deleteKey(20);
        System.out.println("Inorder traversal after deleting node 20:");
        bst.inorder();

        System.out.println("\n\nDelete node 30:");
        bst.deleteKey(30);
        System.out.println("Inorder traversal after deleting node 30:");
        bst.inorder();

        System.out.println("\n\nDelete node 50:");
        bst.deleteKey(50);
        System.out.println("Inorder traversal after deleting node 50:");
        bst.inorder();
    }
}
