public class Queue_Array{
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        Queue(int n){
            this.size = n;
            arr = new int[n];
            rear = -1;
        }

        public static Boolean isEmpty(){
            return rear==-1;
        }
        public static Boolean isFull(){
            return rear==size-1;
        }

        // Enque --> O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue --> O(n)
        public static void remove(){
            if(isEmpty()){
                System.out.println("Empty Array");
                return;
            }
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Array");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);   
        q.add(4);
        q.add(5);   

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}