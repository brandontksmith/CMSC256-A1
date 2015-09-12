package com.btks.a1.q3;

/**
 * A model for an Isosceles Triangle.
 * 
 * @author BTKS
 */
public class IsoscelesTriangle extends Triangle {
    
    private double differentSide; // the length of the different side
    private double equalSides;    // the length of the two equal sides
    
    /**
     * Construct a new Isosceles Triangle.
     * 
     * @param differentSide the length of the different side
     * @param equalSides    the length of the two equal side
     */
    public IsoscelesTriangle(double differentSide, double equalSides) {        
        super(equalSides, equalSides, differentSide);

        this.differentSide = differentSide;
        this.equalSides = equalSides;
    }    

    /**
     * @return the length of the different side
     */
    public double getDifferentSide() {
        return differentSide;
    }
    
    /**
     * @param differentSide the length of the different side
     */
    public void setDifferentSide(double differentSide) {
        this.differentSide = differentSide;
    }

    /**
     * @return the length of the two equal sides
     */
    public double getEqualSides() {
        return equalSides;
    }

    /**
     * @param equalSides the length of the two equal sides
     */
    public void setEqualSides(double equalSides) {
        this.equalSides = equalSides;
    }
}