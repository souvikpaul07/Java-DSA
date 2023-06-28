import java.util.ArrayList;

public class Stack_ArrayList {
    static class Stack{
        static ArrayList <Integer> list = new ArrayList<>();

        public static Boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static void pop(){
            if(isEmpty()){
                return;
            }
            list.remove(list.get(list.size()-1));
        }

        public static void peek(){
            if(isEmpty()){
                return;
            }
            System.out.println(list.get(list.size()-1));
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
            s.peek();
            s.pop();
        }
    }

}
