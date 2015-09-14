package com.btks.a1.q5;

/**
 * A model for a Box.
 * 
 * @author BTKS
 */
public class Box {
    
    private int height; // the height of the box
    private int length; // the length of the box
    private int width;  // the width of the box
    
    /**
     * Construct a new Box.
     */
    public Box() {
        this(0, 0, 0);
    }
    
    /**
     * Construct a new Box.
     * 
     * @param length the length of the box
     * @param width  the width of the box
     * @param height the height of the box
     */
    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the height of the box.
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height of the box
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Returns the length of the box. 
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length of the box
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Returns the width of the box. 
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width of the box
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * Calculates the volume of the box.
     * 
     * @return the volume of the box
     */
    public int volume() {
        int volume;
        
        volume = length * width * height;
        
        return volume;
    }
}