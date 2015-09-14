package com.btks.a1.q3;

/**
 * A model for an Isosceles Triangle.
 * 
 * @author BTKS
 */
public class IsoscelesTriangle extends Triangle {
    
    private final double differentSide; // the length of the different side
    private final double equalSides;    // the length of the two equal sides
    
    /**
     * Construct a new Isosceles Triangle.
     * 
     * @param differentSide the length of the different side
     * @param equalSides    the length of the two equal side
     * @throws com.btks.a1.q3.InvalidTriangleException the lengths do not make a Triangle
     */
    public IsoscelesTriangle(double differentSide, double equalSides) throws InvalidTriangleException {        
        super(equalSides, equalSides, differentSide);

        this.differentSide = differentSide;
        this.equalSides = equalSides;
    }    

    /**
     * Returns the length of the different side.
     */
    public double getDifferentSide() {
        return differentSide;
    }
    
    /**
     * Returns the length of the two equal sides.
     */
    public double getEqualSides() {
        return equalSides;
    }
}