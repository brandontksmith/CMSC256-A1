package com.btks.a1.q3;

/**
 * A model for an Equilateral Triangle.
 * 
 * @author BTKS
 */
public class EquilateralTriangle extends IsoscelesTriangle {
    
    private final double lengthOfSides; // the length for all sides
    
    /**
     * Construct a new Equilateral Triangle.
     * 
     * @param lengthOfSides the length for all sides of the Triangle
     * @throws com.btks.a1.q3.InvalidTriangleException the lengths do not make a Triangle
     */
    public EquilateralTriangle(double lengthOfSides) throws InvalidTriangleException {
        super(lengthOfSides, lengthOfSides);
        
        this.lengthOfSides = lengthOfSides;
    }
    
    /**
     * Returns the length of all sides.
     */
    public double getLengthOfSides() {
        return lengthOfSides;
    }
}