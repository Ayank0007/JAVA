import java.util.Stack;

public interface NextGreater {
    public static int[] findGreater(int[] numbers){
        int[] result=new int[numbers.length];
        Stack<Integer>s=new Stack<>();
        result[result.length-1]=-1;
        s.push(result.length-1);
        for (int i = result.length-2; i >=0; i--) {
            while (!s.isEmpty() && numbers[i]>numbers[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                result[i]=-1;
            } else {
                result[i]=numbers[s.peek()];
            }
            s.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers ={9,8,7,11,9,3,6,23,13,12,14};
        int[] result  = findGreater(numbers);

        for (int i : result) {
            System.out.print(i+",");
        }
    }
}
