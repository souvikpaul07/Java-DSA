import java.util.*;
// implement a Queue using 2 Stacks
/* Strategy : take two Stack s1 & s2 -->
   ADD => clear s1 and store in s2 --> add data in s1 --> clear s2 and store back to s1
   REMOVE => pop the stored data from s1
   PEEK => peek the stored data from s1  */
   
public class Problem_1 {
    static class Queue{
    static Stack <Integer> s1 = new Stack<>();
    static Stack <Integer> s2 = new Stack<>();

    public static Boolean isEmpty(){
        return s1.isEmpty();
    }

    // Enque
    public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    // Deque
    public static int remove(){
        return s1.pop();
    }

    // peek
    public static int peek(){
        return s1.peek();
    }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
