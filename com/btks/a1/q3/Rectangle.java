package com.btks.a1.q3;

/**
 * A model for a Rectangle.
 * 
 * @author BTKS
 */
public class Rectangle extends Quadrilateral {
    
    private static final double ANGLES_SUM = 180; // the total sum of two opposite angles in degrees
    
    private final double length; // the length of the Rectangle
    private final double width;  // the width of the Rectangle
    
    /**
     * Construct a new Rectangle.
     * 
     * @param length the length of the Rectangle
     * @param width  the width of the Rectangle
     */
    public Rectangle(double length, double width) {
        super(ANGLES_SUM, length, width, length, width);
        
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of the Rectangle.
     */
    public double getLength() {
        return length;
    }
    
    /**
     * Returns the width of the Rectangle.
     */
    public double getWidth() {
        return width;
    }
}