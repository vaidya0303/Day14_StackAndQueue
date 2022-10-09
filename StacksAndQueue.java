/*
 * 1. ability to create queue ......uc3
 * 2 . ability to deque from beginning.......uc4
 */

 

/*
 * main class
 */
public class StacksAndQueue {

    /*
     * number of items
     */
    private Node front, rear;
    private int currentSize; // number of items

    /*
     * class to define linked node
     */
    private class Node {
        int data;
        Node next;
    }

    /*
     *  create constructor name as QueueUsingLinkedListMain.
     *  this is Zero argument constructor
     */
    public StacksAndQueue() {

        /*
         * front and rear and currentSize is empty
         */
        front = null;
        rear = null;
        currentSize = 0;
    }

    /*
     * create a method isEmpty
     * they are boolean type that means Returns true if the queue is empty, else false.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    /*
     * create a method name as dequeue.
     * Remove item from the beginning of the list.
     */

    public int dequeue() {
        int data = front.data;
        front = front.next;

        /*
         * if condition is true then rear is null
         */
        if (isEmpty()) {
            rear = null;
        }
        currentSize--;
        System.out.println(data + " removed from the queue");
        return data;
    }

    /*
     * create enqueue method and pass the parameter
     * Add data to the end of the list.
     */
    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;

        /*
         * condition check if isEmpty is true then front data is equal to rear data
         * if condition false olderar.next = rear
         * then currentsize is increased
         */
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }

    /*
     * main method all the program execute in main method
     */
    public static void main(String a[]) {

        /*
         * create object of QueueUsingLinkedListMain class
         * object name is queue
         *  not directly calling this class so
         *  we create object coz QueueUsingLinkedListMain in this all method is non static
         */
        StacksAndQueue queue = new StacksAndQueue();

        /*
         * calling method
         */
        queue.enqueue( 56);
        queue.dequeue();
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(70);
        queue.dequeue();
        System.out.println("queue is empty");


    }
}