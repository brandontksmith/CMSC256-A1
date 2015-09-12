package com.btks.a1;

import com.btks.a1.q3.EquilateralTriangle;
import com.btks.a1.q3.IsoscelesTriangle;
import com.btks.a1.q3.Polygon;
import com.btks.a1.q3.Quadrilateral;
import com.btks.a1.q3.Rectangle;
import com.btks.a1.q3.Square;
import com.btks.a1.q3.Triangle;
import java.util.Scanner;

/**
 * This class is useful for testing the classes that implement the Polygon
 * interface and those that extend the Quadrilateral and Triangle classes.
 * 
 * @author BTKS
 */
public class A1_Q3 {
    
    /**
     * allows reading of input from the console
     */
    private static Scanner reader = new Scanner(System.in);
    
    /**
     * Takes necessary input for an Equilateral Triangle, and handles displaying
     * the output.
     */
    private static void chooseEquilateralTriangle() {
        double lengthOfSides;
        EquilateralTriangle triangle;
        
        System.out.print("Enter the length of each side: ");
        lengthOfSides = reader.nextDouble();
        
        triangle = new EquilateralTriangle(lengthOfSides);
        
        displayPerimeterAndArea(triangle);
    }

    /**
     * Takes necessary input for an Isosceles Triangle, and handles displaying
     * the output.
     */
    private static void chooseIsoscelesTriangle() {
        double differentSide, equalSides;
        IsoscelesTriangle triangle;
        
        System.out.print("Enter the length of the two equal sides: ");
        equalSides = reader.nextDouble();
        
        System.out.print("Enter the length of the different side: ");
        differentSide = reader.nextDouble();
        
        triangle = new IsoscelesTriangle(differentSide, equalSides);
        
        displayPerimeterAndArea(triangle);
    }

    /**
     * Takes necessary input for a Quadrilateral, and handles displaying the output.
     */
    private static void chooseQuadrilateral() {
        double sideA, sideB, sideC, sideD, angle;
        Quadrilateral quadrilateral;
        
        System.out.print("Enter length of side A: ");
        sideA = reader.nextDouble();
        
        System.out.print("Enter length of side B: ");
        sideB = reader.nextDouble();
        
        System.out.print("Enter length of side C: ");
        sideC = reader.nextDouble();
        
        System.out.print("Enter length of side D: ");
        sideD = reader.nextDouble();
        
        System.out.print("Enter the sum of two opposite angles: ");
        angle = reader.nextDouble();
        
        quadrilateral = new Quadrilateral(angle, sideA, sideB, sideC, sideD);
        
        displayPerimeterAndArea(quadrilateral);
    }

    /**
     * Takes necessary input for a Rectangle, and handles displaying the output.
     */
    private static void chooseRectangle() {
        double length, width;
        Rectangle rectangle;
        
        System.out.print("Enter length of rectangle: ");
        length = reader.nextDouble();
        
        System.out.print("Enter width of rectangle: ");
        width = reader.nextDouble();
        
        rectangle = new Rectangle(length, width);
        
        displayPerimeterAndArea(rectangle);
    }
    
    /**
     * Takes necessary input for a Square, and handles displaying the output.
     */
    private static void chooseSquare() {
        double lengthOfSides;
        Square square;
        
        System.out.print("Enter the length of each side: ");
        lengthOfSides = reader.nextDouble();
        
        square = new Square(lengthOfSides);
        
        displayPerimeterAndArea(square);
    }
    
    /**
     * Takes necessary input for a Triangle, and handles displaying the output.
     */
    private static void chooseTriangle() {
        double sideA, sideB, sideC;
        Triangle triangle;
        
        System.out.print("Enter length of side A: ");
        sideA = reader.nextDouble();
        
        System.out.print("Enter length of side B: ");
        sideB = reader.nextDouble();
        
        System.out.print("Enter length of side C: ");
        sideC = reader.nextDouble();
        
        triangle = new Triangle(sideA, sideB, sideC);
        
        displayPerimeterAndArea(triangle);
    }
    
    /**
     * Displays the area and perimeter of the specified shape.
     * 
     * @param shape 
     */
    private static void displayPerimeterAndArea(Polygon shape) {
        System.out.println();
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
        System.out.println();
    }
    
    /**
     * The main method where the program begins.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Please choose from one of the following polygons:\n\n"
                + "1 = Triangle\n"
                + "2 = Equilateral Triangle\n"
                + "3 = Isosceles Triangle\n"
                + "4 = Quadrilateral\n"
                + "5 = Rectangle\n"
                + "6 = Square\n"
                + "7 = Quit\n");
        
        while (true) {
            System.out.print("Enter option: ");
            int shapeChosen = reader.nextInt();
            
            switch (shapeChosen) {
                case 1:
                    chooseTriangle();
                    break;
                case 2:
                    chooseEquilateralTriangle();
                    break;
                case 3:
                    chooseIsoscelesTriangle();
                    break;
                case 4:
                    chooseQuadrilateral();
                    break;
                case 5:
                    chooseRectangle();
                    break;
                case 6:
                    chooseSquare();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have not entered a valid option.\n\n");
                    break;
            }
        }
    }
}