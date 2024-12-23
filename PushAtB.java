import java.util.Stack;

public class PushAtB {

    public static void pushAtBottom(Stack<Integer>input,int ele){
        if (input.isEmpty()) {
            input.push(ele);
            return;
        }
        int temp=input.pop();
        pushAtBottom(input, ele);
        input.push(temp);
    }
    public static void reverse(Stack<Integer>input){
        if (input.isEmpty()) {
            return;
        }
        int top=input.pop();
        reverse(input);
        pushAtBottom(input, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.print(s.pop()+"<->");
        }
    }
}
