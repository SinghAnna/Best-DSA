import java.util.ArrayList;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}


public class InOrder {

    static void inOrder(Node root,ArrayList<Integer> res){

        if (root == null) {
            return;
        }

        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }
    public static void main(String[] args) {
          Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> res = new ArrayList<>();
        inOrder(root, res);

        for(int node : res)
            System.out.print(node + " ");
    }
    }

