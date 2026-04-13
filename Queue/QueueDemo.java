class Queue{
    int size;
    int[] arr;
    int front;
    int rear;
    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int val){
         if(isEmpty()){
            front =0;
         }
         if(isFull()){
            System.out.println("OverFlow");
            return;
         }
         arr[++rear] = val;
    }
    
    int dequeue(){
        if(isEmpty()){
            System.out.println("Not possible queue is empty");
            return -1;
        }
        int ele = arr[front];
        front++;
        return ele;
    }
    
    boolean isFull(){
        return rear == size-1;
    }
    boolean isEmpty(){
        if(front == -1 || front>rear){
            return true;
        }
        return false;
    }
    
    int peek(){
        if(isEmpty()){
            System.out.println("Not possible queue is empty");
            return -1;
        }
        return arr[front];
    }
}


public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        int ele = q.dequeue();
        System.out.println(ele);
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }
}
