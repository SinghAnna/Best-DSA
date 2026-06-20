class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

public class PreOrder {


    static void printPreOrder(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void main(String[] args) {
     
        
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.left.left.left = new Node(6);
         root.right.right = new Node(7); 

         printPreOrder(root);
    }
}
