package com.btks.a1.q3;

/**
 * A model for a Quadrilateral.
 * 
 * @author BTKS
 */
public class Quadrilateral implements Polygon {
    
    private double angle; // the the sum of two opposite angles (in degrees)
    
    private double sideA; // the length of side A
    private double sideB; // the length of side B
    private double sideC; // the length of side C
    private double sideD; // the length of side D
    
    /**
     * Construct a new Quadrilateral.
     * 
     * @param sideA the length of side A
     * @param sideB the length of side B
     * @param sideC the length of side C
     * @param sideD the length of side D
     * @param angle the sum of two opposite angles (in degrees)
     */
    public Quadrilateral(double angle, double sideA, double sideB, double sideC, double sideD) {
        this.angle = angle;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    
    /**
     * Calculates the area of the Quadrilateral.
     * 
     * @return the area of the quadrilateral
     */
    public double area() {
        double area;
        
        double halfPerimeter = perimeter() / 2;
        
        // area of any quadrilateral using Bretschneider's Formula
        // area = ((s - a)(s - b)(s - c)(s - d) - (abcd * cos(sum of two opposite angles in radians / 2))^2)^(1/2)
        // where s is equal to the half perimeter and a, b, c, and is the length of each corresponding side
        area = (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC) * (halfPerimeter - sideD);
        area = area - (sideA * sideB * sideC * sideD * Math.pow(Math.cos(Math.toRadians(angle) / 2), 2));
        area = Math.sqrt(area);
        
        return area;
    }
    
    /**
     * @return the sum of two opposite angles (in degrees)
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the sum of two opposite angles (in degrees)
     */
    public void setAngle(double angle) {
        this.angle = angle;
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
     * @return the length of side D
     */
    public double getSideD() {
        return sideD;
    }

    /**
     * @param sideD the length of side D
     */
    public void setSideD(double sideD) {
        this.sideD = sideD;
    }
    
    /**
     * Calculates the perimeter of the Quadrilateral.
     * 
     * @return the perimeter of the quadrilateral
     */
    public double perimeter() {
        double perimeter;
        
        perimeter = sideA + sideB + sideC + sideD;
                
        return perimeter;
    }
}