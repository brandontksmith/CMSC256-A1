package com.btks.a1.q3;

/**
 * A model for a Square.
 * 
 * @author BTKS
 */
public class Square extends Rectangle {
        
    private final double lengthOfSides; // the length of each side
    
    /**
     * Construct a new Square.
     * 
     * @param lengthOfSides the length of each side
     */
    public Square(double lengthOfSides) {
        super(lengthOfSides, lengthOfSides);
        
        this.lengthOfSides = lengthOfSides;
    }

    /**
     * Returns the length of each side.
     */
    public double getLengthOfSides() {
        return lengthOfSides;
    }
}