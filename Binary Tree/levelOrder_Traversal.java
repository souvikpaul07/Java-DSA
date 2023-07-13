import java.util.*;
public class levelOrder_Traversal {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int [] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }

    public static void levelOrder(Node root){
        Queue <Node> list = new LinkedList<>();
        list.add(root);
        list.add(null);
        while(!list.isEmpty()){
            Node currNode = list.remove();
            if(currNode==null){
                System.out.println();
                if(list.isEmpty()){
                    break;
                }else{
                    list.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    list.add(currNode.left);
                }
                if(currNode.right != null){
                    list.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(arr);
        levelOrder(root);
    }
}