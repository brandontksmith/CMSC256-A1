package com.btks.a1.q3;

/**
 * A model for a Triangle.
 * 
 * @author BTKS
 */
public class Triangle implements Polygon {
    
    private final double sideA; // the length of side A
    private final double sideB; // the length of side B
    private final double sideC; // the length of side C
    
    /**
     * Construct a new Triangle.
     * 
     * @param sideA the length of side A
     * @param sideB the length of side B
     * @param sideC the length of side C
     * @throws com.btks.a1.q3.InvalidTriangleException the lengths do not make a Triangle
     */
    public Triangle(double sideA, double sideB, double sideC) throws InvalidTriangleException {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        
        if (!isValid()) {
            throw new InvalidTriangleException("The three side lengths do not make a Triangle.");
        }
    }
    
    /**
     * Calculates the area of the Triangle.
     * 
     * @return the area of the Triangle
     */
    @Override
    public double area() {
        double area;
        
        
        double halfPerimeter = perimeter() / 2;
        
        /**
         * Calculating area of triangle using Heron's Formula
         * area = (p(p - a)(p - b)(p - c))^(1/2), where a, b, and c are the three
         * sides of the triangle and p is half the perimeter of the triangle.
         */
        area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        
        return area;
    }
    
    /**
     * Returns the length of side A.
     */
    public double getSideA() {
        return sideA;
    }
    
    /**
     * Returns the length of side B.
     */
    public double getSideB() {
        return sideB;
    }
    
    /**
     * Returns the length of side C.
     */
    public double getSideC() {
        return sideC;
    }
    
    /**
     * Returns whether or not the three sides can make a Triangle.
     * 
     * @return true if the Triangle Inequality Theorem holds, false otherwise
     */
    public boolean isValid() {
        /*
         * A Triangle is valid if, and only if, it passes the Triangle Inequality Theorem,
         * which states that the sum of two sides lengths is greater than the third. This
         * must hold for all three combinations.
         */
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            return true;
        }
        
        return false;
    }
    
    /**
     * Calculates the perimeter of the Triangle.
     *
     * @return the perimeter of the triangle
     */
    @Override
    public double perimeter() {
        double perimeter = sideA + sideB + sideC;
        
        return perimeter;
    }
}