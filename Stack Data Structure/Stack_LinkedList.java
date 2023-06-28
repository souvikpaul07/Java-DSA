public class Stack_LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        static Node head;
        public static Boolean isEmpty(){
            return head == null;
        }

        // push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public static void pop(){
            if(isEmpty()){
                return;
            }
            int top = head.data;
            head = head.next;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        } 
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}