public class Counts_of_Nodes {
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

    static class Buildtree{
        static int idx = -1;
        public static Node BinaryTree(int[] arr){
            idx++;
            if(arr[idx] == -1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = BinaryTree(arr);
            newNode.right = BinaryTree(arr);
            return newNode;
        }
    }

    public static int countsOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount = countsOfNodes(root.left);
        int rightCount = countsOfNodes(root.right);
        return leftCount+rightCount+1;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Buildtree tree = new Buildtree();
        Node root = tree.BinaryTree(nodes);
        System.out.println(countsOfNodes(root));
    }
}
