public class Sum_of_Nodes {
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

    static class BuildTree{
        static int idx = -1;
        public static Node BinaryTree(int[] arr){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = BinaryTree(arr); 
            newNode.right = BinaryTree(arr);
            return newNode;
        }
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int sumLeft = sumOfNodes(root.left);
        int sumRight = sumOfNodes(root.right);
        return sumLeft+sumRight+(root.data);
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,-1};
        BuildTree tree = new BuildTree();
        Node root = tree.BinaryTree(nodes);
        System.out.println(sumOfNodes(root));
    }
}
