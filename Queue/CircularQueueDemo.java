class CircularQueue{
    int size;
    int[] arr;
    int front;
    int rear;
    int counter =0;
    CircularQueue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int val){
        if(isFull()){
            System.out.println("queue is full");
            return;
         }
         if(isEmpty()){
            front =0;
         }
         rear = (rear+1) % size;
         arr[rear] = val;
         counter++;
    }
    
    int dequeue(){
        if(isEmpty()){
            System.out.println("Not possible queue is empty");
            return -1;
        }
        int ele = arr[front];
        front = (front+1)%size;
        counter--;
        if(counter ==0){
            front = -1;
            rear = -1;
        }
        return ele;
    }
    
    boolean isFull(){
        // if(rear == front-1 || front = rear-1  || rear == size-1){
        //     return true;
        // }
        // return false;
        return counter == size;
    }
    boolean isEmpty(){
        // if(front == -1){
        //     return true;
        // }
        // return false;
        return counter==0;
    }
    
    int peek(){
        if(isEmpty()){
            System.out.println("Not possible queue is empty");
            return -1;
        }
        return arr[front];

    }
}



public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(6);
        System.out.println(q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.isFull());
        int ele = q.dequeue();
        System.out.println(ele);
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }   
}
