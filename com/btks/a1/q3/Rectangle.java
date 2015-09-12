package com.btks.a1.q3;

/**
 * A model for a Rectangle.
 * 
 * @author BTKS
 */
public class Rectangle extends Quadrilateral {
    
    private static final double ANGLES_SUM = 180; // the total sum of two opposite angles in degrees
    
    private double length; // the length of the Rectangle
    private double width;  // the width of the Rectangle
    
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
     * @return the length of the Rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length of the Rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width of the Rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width of the Rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }
}