package com.btks.a1.q3;

/**
 * A model for a Triangle.
 * 
 * @author BTKS
 */
public class Triangle implements Polygon {
    
    private double sideA; // the length of side A
    private double sideB; // the length of side B
    private double sideC; // the length of side C
    
    /**
     * Construct a new Triangle.
     * 
     * @param sideA the length of side A
     * @param sideB the length of side B
     * @param sideC the length of side C
     */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    /**
     * Calculates the area of the Triangle.
     * 
     * @return the area of the Triangle
     */
    public double area() {
        double area = 0;
        
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
     * @return the length of side A
     */
    public double getSideA() {
        return sideA;
    }
    
    /**
     * @param sideA the length of side A
     */
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    /**
     * @return the length of side B
     */
    public double getSideB() {
        return sideB;
    }

    /**
     * @param sideB the length of side B
     */
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    /**
     * @return the length of side C
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * @param sideC the length of side C
     */
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    /**
     * Calculates the perimeter of the Triangle.
     * 
     * @return the perimeter of the triangle
     */
    public double perimeter() {
        double perimeter = sideA + sideB + sideC;
        
        return perimeter;
    }
}