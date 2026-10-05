/**
 * Implement a stack ADT in the class MyStack.
- public MyStack() – Constructs a stack that can hold 100 elements.
- public MyStack(int maxSize) – Constructs a stack that can hold maxSize
elements.
- public void push(int element) – Pushes an element on to the stack.
- public int pop() – Pops an element off of the stack.
- public boolean isEmpty() – Indicates whether stack contains any elements.
- public int top() – Reads the element at the top of the stack.
- public int size() – Returns the number of elements stored in the stack.
- public boolean isFull() – Indicates whether the stack has exhausted its available storage.
- public String toString() – Returns the contents of the stack from top to bottom.

All methods (except toString()) must operate in O(1) time.
All code should adhere to coding standards.
 */

public class myStack
{
    private int indx; //index of first empty spot
    private int[] arr;
    
    /**
     *  Constructs a stack
     *  <p>
     *  Constructs a stack that can hold 100 elements.
     */
    public myStack(){
        arr = new int[100];
        indx = 0;
    }
    
    /**
     * Constructs a stack
     * <p>
     * Constructs a stack that can hold maxSize elements.
     * 
     * @param maxSize  The maximum size of the stack
     */
    public myStack(int maxSize){
        arr = new int[maxSize];
        indx = 0;
    }
    
    public boolean isEmpty(){
        return indx == 0;
    }
    
    public boolean isFull(){
        return indx == arr.length;
    }
    
    public void push(int element){
        arr[indx] = element;
        indx++;
    }
    
    public int pop()
    {
        int temp = arr[indx - 1];
        arr[indx - 1] = 0;
        indx--;
        
        return temp;
    }
    
    public int top()
    {
        return arr[indx - 1];
    }
    
    public int size()
    {
        return indx;
    }
    
    public String toString(){
        String str = "";
        
        for (int i = arr.length - 1; i >= 0; i--){
            str += arr[i];
        }
        
        return str;
    }
}