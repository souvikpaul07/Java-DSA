import java.util.Stack;

// To push an element at the bottom of a stack
// Strategy : pop all the elements and when the stack is empty, push the given data and then push that elements again in the stack

public class Ques_1 {
    public static void pushFromButtom(int data, Stack <Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushFromButtom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        pushFromButtom(4, list);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }

    }
}
