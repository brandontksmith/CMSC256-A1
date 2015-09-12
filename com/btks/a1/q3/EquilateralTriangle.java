package com.btks.a1.q3;

/**
 * A model for an Equilateral Triangle.
 * 
 * @author BTKS
 */
public class EquilateralTriangle extends Triangle {
    
    private double lengthOfSides; // the length for all sides
    
    /**
     * Construct a new Equilateral Triangle.
     * 
     * @param lengthOfSides the length for all sides of the Triangle
     */
    public EquilateralTriangle(double lengthOfSides) {        
        super(lengthOfSides, lengthOfSides, lengthOfSides);
        
        this.lengthOfSides = lengthOfSides;
    }    

    /**
     * @return the length of all sides
     */
    public double getLengthOfSides() {
        return lengthOfSides;
    }

    /**
     * @param lengthOfSides the length of all sides
     */
    public void setLengthOfSides(double lengthOfSides) {
        this.lengthOfSides = lengthOfSides;
    }
}