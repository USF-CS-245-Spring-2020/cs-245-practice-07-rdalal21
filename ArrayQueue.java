
public class ArrayQueue<T>  implements Queue<T> {
		public int front;
	    public int back;
	    public int capacity;
	    public T[] queue;
	    static final int DEFAULT_INITIAL_CAPACITY = 10;
	    
	    //Constructor
	    public ArrayQueue(){
	        front=0;
	        back=0;
	        capacity=0;
	        queue = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
	    }
	    
	    /*
	     * Implement check for empty method

	     */
	    public boolean empty(){
	        if(capacity==0){
	            return true;
	        }
	        return false;
	    }
	    
	    /*
	     * Implement method enqueue

	     */
	    public void enqueue(T item){
	        if(capacity==queue.length){
	            reSizeArray();
	        }
	        queue[(back%queue.length)] =item;
	        back++;
	        capacity++;
	    }
	    
	    /*
	     * Implement method dequeue

	     */
	    
	    public T dequeue() throws Exception
	    {
	        if(empty())
	            System.exit(1);
	        T itemRemoved = queue[front];
	        front++;
	        capacity--;
	        return itemRemoved;
	    }
	    
	    /*
	     * Resize/ expand size of array size

	     */
	    public void reSizeArray(){
	        T[] newQueue= (T[]) new Object[queue.length*2];
	        for(int i =0; i<capacity;i++){
	            newQueue[i] = queue[(front+i)%queue.length];
	        }
	        front =0;
	        back=capacity;
	        queue=newQueue;
	    }
	}