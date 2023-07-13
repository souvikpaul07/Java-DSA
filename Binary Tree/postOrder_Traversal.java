public class postOrder_Traversal {
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
    static class Binarytree{
        static int idx=-1;
        public static Node buildtree(int[] arr){
            idx++;
            if(arr[idx] == -1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildtree(arr);
            newNode.right = buildtree(arr);
            return newNode;
        }
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        postOrder(root);
    }
}
