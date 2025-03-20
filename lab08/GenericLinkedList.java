package lab08;
import java.util.ArrayList;
public class GenericLinkedList<T> {
    private Node<T> head;  // Head of the linked list
    int size;              // List size

    // Constructor method
    public GenericLinkedList() {
        head = null; //head is null and the list is empty at the beginning
        size = 0;
    }
    
    /* Return the size of the linked list */
    public int size() {
        // TODO Add code below
    }

    /* Add a new element to the end of the linked list */
    public void add(T obj) {
        // TODO Add code below
    }

    /* Remove and return the element at the given index in the linked list */
    public T remove(int index) {
        // TODO Add code below
    }

    /* Remove true if the given obj is removed from the linked list */
    public boolean remove(T obj) {
        // TODO Add code below
    }

    /* Return true if the linked list is empty */
    public boolean isEmpty() {
        // TODO Add code below
    }
    
    /* Return the string representation of the linked list */
    @Override
    public String toString() {
        // TODO Add code below
    }

    public static void main(String[] args) {
        // TODO Add code below
    }
}
