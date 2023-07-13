public class Height_of_Tree {
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

    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int heightLeft = heightOfTree(root.left);
        int heightRight = heightOfTree(root.right);
        return Math.max(heightLeft, heightRight)+1;

        /* 
        if(heightLeft>heightRight){
            return heightLeft+1;
        }else{
            return heightRight+1;
        } 
        */
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,-1};
        BuildTree tree = new BuildTree();
        Node root = tree.BinaryTree(nodes);
        System.out.println(heightOfTree(root));
    }
}

