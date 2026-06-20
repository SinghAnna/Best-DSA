import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

public class LevelOrderTraversal {

    static ArrayList<ArrayList<Integer>> levelOrder(Node root){

        if (root == null) {
            return new ArrayList<>();
        }


        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        int currLevel = 0;

        while (!q.isEmpty()) {
            int len = q.size();

            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                
                Node node = q.poll();

                res.get(currLevel).add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }

            }
            currLevel++;
        }
        
        return res;

    }

    public static void main(String[] args) {

         Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);



    }
}
