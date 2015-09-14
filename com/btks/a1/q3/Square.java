package com.btks.a1.q3;

/**
 * A model for a Square.
 * 
 * @author BTKS
 */
public class Square extends Quadrilateral {
    
    private static final double ANGLES_SUM = 180; // the total sum of two opposite angles in degrees
    
    private final double lengthOfSides; // the length of each side
    
    /**
     * Construct a new Square.
     * 
     * @param lengthOfSides the length of each side
     */
    public Square(double lengthOfSides) {
        super(ANGLES_SUM, lengthOfSides, lengthOfSides, lengthOfSides, lengthOfSides);
        
        this.lengthOfSides = lengthOfSides;
    }

    /**
     * Returns the length of each side.
     */
    public double getLengthOfSides() {
        return lengthOfSides;
    }
}