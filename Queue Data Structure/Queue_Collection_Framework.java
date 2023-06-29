import java.util.Queue;
import java.util.LinkedList;
public class Queue_Collection_Framework {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();  // Queue <Integer> q = new ArrayDeque<>();
        // as Queue is a interface in java we can't instantiate it as object. Only Classes can be instantiated as object not the interfaces
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
