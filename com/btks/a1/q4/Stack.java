package com.btks.a1.q4;

/**
 * An interface for a Stack.
 * 
 * @author BTKS
 * @param <E> the type of element in the stack
 */
public interface Stack<E> {
    
    /**
     * Determines if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty();
    
    /**
     * Returns the element at the top of the stack without removing
     * the element from the stack.
     * 
     * @return the element at the top of the stack
     */
    public E peek();
    
    /**
     * Returns the element at the top of the stack and removes the element
     * from the stack.
     * 
     * @return the element at the top of the stack
     */
    public E pop();
    
    /**
     * Places an element at the top of the stack.
     * 
     * @param item the item to push onto the stack.
     */
    public void push(E item);
    
    /**
     * Returns the number of elements in the stack.
     * 
     * @return the size of the stack
     */
    public int size();
}