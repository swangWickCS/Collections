
/**
 * Implement a generic single linked list in the class MyLinkedList.
- void addHead(E element) – Adds element at beginning of list.
- void addTail(E element) – Adds element at end of list.
- E removeHead() – Removes and returns element at beginning of list.
- E getHead() – Returns element at beginning of list.
- boolean isEmpty() – Indicates whether list is empty.
- int size() – Returns number of elements in list.
- String toString() – Returns elements in list as one string.

getHead() and removeHead() should throw NoSuchElementException if called on an empty list.

Add the Node class as a private nested class in MyLinkedList.
 */
public class MyLinkedList<E>{
    /**
     * Adds element at beginning of list
     */
    public void addHead(E element){
        Node node = new Node();
        
    }
    
    /**
     * Adds element at end of list
     */
    public void addTail(E element){
        
    }
    
    
    
    private class Node<E>{
        public Node(){
            
        }
    }
}
