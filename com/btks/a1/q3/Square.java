package com.btks.a1.q3;

/**
 * A model for a Square.
 * 
 * @author BTKS
 */
public class Square extends Quadrilateral {
    
    private double lengthOfSides; // the length of each side
    
    /**
     * Construct a new Square.
     * 
     * @param lengthOfSides the length of each side
     */
    public Square(double lengthOfSides) {
        super(180, lengthOfSides, lengthOfSides, lengthOfSides, lengthOfSides);
        
        this.lengthOfSides = lengthOfSides;
    }

    /**
     * @return the length of each side
     */
    public double getLengthOfSides() {
        return lengthOfSides;
    }

    /**
     * @param lengthOfSides the length of each side
     */
    public void setLengthOfSides(double lengthOfSides) {
        this.lengthOfSides = lengthOfSides;
    }   
}