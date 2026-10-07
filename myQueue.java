
/**
 * Write a description of class myQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myQueue{
    private int[] arr;
    private int front;
    private int back;
    
    public myQueue(){
        arr = new int[100];
        front = 0;
        back = -1;
    }
    
    public myQueue(int maxSize){
        arr = new int[maxSize];
        front = 0;
        back = -1;
    }
    
    public void enqueue(int element){
        back = (back + 1) % arr.length;
        arr[back] = element;
    }
    
    public int dequeue(){
        int temp = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;
        
        return temp;
    }
    
    public int front(){
        return arr[front];
    }
    
    public boolean isEmpty()
    {
        return (back + 1) % arr.length == front;
    }
    
    public boolean isFull()
    {
        return (back + 2) % arr.length == front;
    }
    
    public int size(){
        return front;
    }
    
    public String toString(){
        String str = "";
 
        for (int i = 0; i < this.size(); i++){
            str += arr[(front + i) % arr.length] + " ";
        }
 
        return str;
    }
    

}