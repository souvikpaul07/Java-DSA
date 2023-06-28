import java.util.*;

// Reverse a Stack
// Strategy : pop all the elements from the stack and then push all the elements at the buttom.

public class Ques_2 {
    public static void pushAtButtom(int data, Stack <Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButtom(data, s);
        s.push(top);
    }
    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtButtom(top, s);
    }
    public static void main(String[] args) {
        Stack <Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);

        reverseStack(list);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
