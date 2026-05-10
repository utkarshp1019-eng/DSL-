@@ -1,3 +1,4 @@
import java.util.Scanner;
class Node {
    int data;
    Node left, right;
@@ -52,17 +53,20 @@ void postorder(Node root) {
public class Bst {
    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);

 
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

     
        System.out.println("Enter values:");ystem.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.root = tree.insert(tree.root, value);
        }
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
@@ -72,6 +76,7 @@ public static void main(String[] args) {

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
        System.out.println();
 				System.out.println();   
        sc.close();
    }
}
