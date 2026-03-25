class MyStack {
    private int arr[];  //private banane ka reason ki arr bahar se accessable na ho
    private int top;
    int capacity;
    public MyStack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }
    
    public void push(int item){
        if(top==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = item;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
}


public class StackDemo{
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        System.out.println(st.pop());
        st.push(10);
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st.peek());
        st.push(30);
        System.out.println(st.peek());
        st.push(40);
        System.out.println(st.peek());
        st.push(50);
        System.out.println(st.peek());
    }
}