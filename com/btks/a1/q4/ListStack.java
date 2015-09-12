package com.btks.a1.q4;

import java.util.LinkedList;

/**
 * A ListStack is a stack that is implemented as a wrapper around a
 * LinkedList (java.util.LinkedList).
 * 
 * @author BTKS
 * @param <E> the type of element in the stack
 */
public class ListStack<E> implements Stack<E> {
    
    private LinkedList<E> list; // the list to hold the elements of the stack
    
    /**
     * Construct a new ListStack.
     */
    public ListStack() {
        list = new LinkedList<>();
    }
    
    /**
     * Construct a new ListStack.
     * 
     * @param list the list to hold the elements of the stack
     */
    public ListStack(LinkedList<E> list) {
        this.list = list;
    }
    
    /**
     * Determines if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    /**
     * Returns the element at the top of the stack without removing
     * the element from the stack if, and only if, the stack is not
     * empty; otherwise, nothing is returned.
     * 
     * @return the element at the top of the stack or null
     */
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        
        return list.getFirst();
    }

    /**
     * Returns the element at the top of the stack and removes the
     * element from the stack, if and only if, the stack is not empty;
     * otherwise, nothing is returned.
     * 
     * @return the element at the top of the stack or null
     */
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        
        return list.removeFirst();
    }
    
    /**
     * Places an element at the top of the stack.
     * 
     * @param item the item to push onto the stack
     */
    public void push(E item) {
        list.addFirst(item);
    }

    /**
     * Returns the number of elements in the stack.
     * 
     * @return the size of the stack
     */
    public int size() {
        return list.size();
    }
}