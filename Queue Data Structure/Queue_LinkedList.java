public class Queue_LinkedList{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static Boolean isEmpty(){
            return head == null && tail == null;
        }

        // Enque
        public static void add(int data){
            Node newNode = new Node (data);
            if(isEmpty()){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }

        }

        // Deque
        public static void remove(){
            if(isEmpty()){
                System.out.println("Empty list");
                return;
            }
            //single node
            if(head==tail){
                tail = null;
            }
            head = head.next;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty list");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}