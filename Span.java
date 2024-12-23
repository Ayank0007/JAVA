import java.util.Stack;

public class Span {

    public static int[] span(int[] stocks){
        int[] spans=new int[stocks.length];
        Stack<Integer> s =new Stack<>();
        spans[0]=1;
        s.push(0);
        for (int i = 1; i < spans.length; i++) {
            int currPrice=stocks[i];
            while (!s.isEmpty() && stocks[s.peek()]<currPrice) {
                s.pop();
            }
            if (s.isEmpty()) {
                spans[i]=i;
            } else {
                spans[i]=i-s.peek();
            }
            s.push(i);
        }
        return spans;
    }
    public static void main(String[] args) {
        int[] stocks={100,80,90,100,110};

        int[] span=span(stocks);
        String op = new String(span.toString());
        System.out.print(op);
    }
}
