public class ArrayStack<T>  implements Stack<T>  {
    public int size;
    public int top;
    public T[] stack;
    static final int DEFAULT_INITIAL_CAPACITY = 10; //can be initialized with default size
    //constructor
    public ArrayStack() {
        top = 0;
        stack = ((T[]) new Object[DEFAULT_INITIAL_CAPACITY]);
	  }

    /*
     * Implement the Stack-Empty(S) function
     */
    public boolean empty() {
        return top == 0;
    }

    /*
     * Implement the Push(S, x) function
     */
    public void push(T item) {
    	
 	    if (top >= stack.length) // if array is full,
           reSizeArray(); // expand array
        stack[top] = item;
        top++;
    }

    /*
     * Implement the Pop(S) function

     */
    public T pop() {
    	if (empty()) {
        	System.exit(1);
        }
    	T removedItem=stack[top-1];
    	top--;
        return removedItem ;
    }
    
    /*
     * Implement the Peek() function

     */
    public T peek() throws Exception{
        if(empty())
            throw new IndexOutOfBoundsException();
        return stack[top];
    }
    /*
     * Resize/ expand size of array size

     */
    private void reSizeArray() {

        T[] newStack = (T[]) new Object[2 * stack.length];
		for (int i=0;i< stack.length; i++)
			 newStack[i]=stack[i];
		stack= newStack;
    }

}
