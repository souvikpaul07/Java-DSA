public class Circular_Queue_Array {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            this.size = n;
            rear = -1;
            front = -1;
            arr = new int[n];
        }
        public static Boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static Boolean isFull(){
            return (rear+1)%size == front;
        }

        // Enque --> O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }

        // Deque --> O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty array");
                return -1;
            }
            int res = arr[front];
            // for single element
            if(front == rear){
                front = rear = -1;
            } else{
                front = (front + 1)%size;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty array");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
