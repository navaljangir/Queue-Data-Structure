
public class circularQueueUsingArray {
    static class Queue{
        static int front =-1;
        static int rear = -1; 
        static int arr[];
        static int size;
        Queue(int n){
           arr = new int[n];
            this.size = n ; 

        }
        public static boolean isEmpty(){
            return rear == -1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear +1)%size ==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return ;
            }
            if(front == -1){
                front = 0; 
            }
            rear = (rear+1)%size; 
            arr[rear] = data;
        }
    
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1; 
        }
        int eleFront = arr[front];
        if(rear==front){
            return -1; 

        }
        else{
            front = (front+1)%size; 
        }
        return eleFront; 
    }

public static int peek(){
    if(isEmpty()){
        System.out.println("queue is empty");
    }
    return arr[front];
}
    }
public static void main(String[] args) {
    
}
    
}
