import java.util.*;
public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());  
        System.out.println(q.pop());    
        System.out.println(q.empty());  
    }
}
class MyQueue {
    ArrayDeque<Integer> st = new ArrayDeque<>();
    ArrayDeque<Integer> st2 = new ArrayDeque<>();
    public void push(int x) {
        while(!st.isEmpty()){
            int a = st.pop();
            st2.push(a);
        }
        st.push(x);
        while(!st2.isEmpty()){
            int a = st2.pop();
            st.push(a);
        }
    }
    public int pop() {
        return st.pop();
    }
    public int peek() {
        return st.peek();
    }
    public boolean empty() {
        if(st.isEmpty()) return true;
        return false;
    }
}
