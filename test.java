/**
 * Tests the myStack class by printing what each method returns
 * next to what it should return.
 */
public class test
{
    public static void main()
    {
        myStack s = new myStack(3);

        System.out.println("New stack:");
        System.out.println("isEmpty: " + s.isEmpty() + " (expected true)");
        System.out.println("isFull: " + s.isFull() + " (expected false)");
        System.out.println("size: " + s.size() + " (expected 0)");
        System.out.println();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("After pushing 1, 2, 3:");
        System.out.println("top: " + s.top() + " (expected 3)");
        System.out.println("size: " + s.size() + " (expected 3)");
        System.out.println("isEmpty: " + s.isEmpty() + " (expected false)");
        System.out.println("isFull: " + s.isFull() + " (expected true)");
        System.out.println("toString: " + s.toString() + " (expected 321)");
        System.out.println();

        System.out.println("Popping:");
        System.out.println("pop: " + s.pop() + " (expected 3)");
        System.out.println("pop: " + s.pop() + " (expected 2)");
        System.out.println("top: " + s.top() + " (expected 1)");
        System.out.println("size: " + s.size() + " (expected 1)");
        System.out.println("isFull: " + s.isFull() + " (expected false)");
        System.out.println("toString: " + s.toString() + " (expected 1)");
        System.out.println();

        System.out.println("pop: " + s.pop() + " (expected 1)");
        System.out.println("isEmpty: " + s.isEmpty() + " (expected true)");
        System.out.println("size: " + s.size() + " (expected 0)");
        System.out.println();

        myStack big = new myStack();
        for (int i = 0; i < 100; i++)
        {
            big.push(i);
        }
        System.out.println("Default stack after 100 pushes:");
        System.out.println("isFull: " + big.isFull() + " (expected true)");
        System.out.println("size: " + big.size() + " (expected 100)");
        System.out.println("top: " + big.top() + " (expected 99)");
        
        
    }
}