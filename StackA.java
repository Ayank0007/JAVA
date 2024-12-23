import java.util.ArrayList;

class StackA{
    static class StackWithAL {
        ArrayList<Integer> list =new ArrayList<>();
                public boolean isEmpty(){
                    return list.size()==0;
                }
                public int pop(){
                    int ele = list.get(list.size()-1);
                    list.remove(list.size()-1);
                    return ele;
                }
                public int peek(){
                    return list.get(list.size()-1);
                }
                public void push(int input){
                    list.add(input);
                }
            }
            public static void main(String[] args) {
                StackWithAL s = new StackWithAL();
                s.push(0);
                s.push(1);
                s.push(2);
                System.out.println(s.list);
    }
}