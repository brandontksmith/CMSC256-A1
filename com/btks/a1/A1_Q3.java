package com.btks.a1;

import com.btks.a1.q3.EquilateralTriangle;
import com.btks.a1.q3.InvalidTriangleException;
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
     * Prompt the user for an input that is a number until a valid number
     * is entered.
     * 
     * @param message the message prompt to show to the user
     * @return the number entered by the user
     */
    private static double askForDouble(String message) {
        double value = -1;
        
        while (value < 0) {
            System.out.print(message);
            
            if (reader.hasNextDouble()) {
                value = reader.nextDouble();
            }
            
            reader.nextLine();
        }
        
        return value;
    }
    
    /**
     * Takes necessary input for an Equilateral Triangle, and handles displaying
     * the output.
     */
    private static void chooseEquilateralTriangle() {
        double lengthOfSides;
        EquilateralTriangle triangle;
        
        lengthOfSides = askForDouble("Enter the length of each side: ");
        
        try {
            triangle = new EquilateralTriangle(lengthOfSides);
            displayPerimeterAndArea(triangle);
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage() + "\n\n");
        }
    }

    /**
     * Takes necessary input for an Isosceles Triangle, and handles displaying
     * the output.
     */
    private static void chooseIsoscelesTriangle() {
        double differentSide, equalSides;
        IsoscelesTriangle triangle;
        
        equalSides = askForDouble("Enter the length of the two equal sides: ");
        differentSide = askForDouble("Enter the length of the different side: ");
        
        try {
            triangle = new IsoscelesTriangle(differentSide, equalSides);
            displayPerimeterAndArea(triangle);
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage() + "\n\n");
        }
    }

    /**
     * Takes necessary input for a Quadrilateral, and handles displaying the output.
     */
    private static void chooseQuadrilateral() {
        double sideA, sideB, sideC, sideD, angle;
        Quadrilateral quadrilateral;
        
        sideA = askForDouble("Enter length of side A: ");
        sideB = askForDouble("Enter length of side B: ");
        sideC = askForDouble("Enter length of side C: ");
        sideD = askForDouble("Enter length of side D: ");
        angle = askForDouble("Enter the sum of two opposite angles: ");
        
        quadrilateral = new Quadrilateral(angle, sideA, sideB, sideC, sideD);
        
        displayPerimeterAndArea(quadrilateral);
    }

    /**
     * Takes necessary input for a Rectangle, and handles displaying the output.
     */
    private static void chooseRectangle() {
        double length, width;
        Rectangle rectangle;
        
        length = askForDouble("Enter length of rectangle: ");
        width = askForDouble("Enter width of rectangle: ");
        
        rectangle = new Rectangle(length, width);
        
        displayPerimeterAndArea(rectangle);
    }
    
    /**
     * Takes necessary input for a Square, and handles displaying the output.
     */
    private static void chooseSquare() {
        double lengthOfSides;
        Square square;
        
        lengthOfSides = askForDouble("Enter the length of each side: ");
        
        square = new Square(lengthOfSides);
        
        displayPerimeterAndArea(square);
    }
    
    /**
     * Takes necessary input for a Triangle, and handles displaying the output.
     */
    private static void chooseTriangle() {
        double sideA, sideB, sideC;
        Triangle triangle;
        
        sideA = askForDouble("Enter length of side A: ");
        sideB = askForDouble("Enter length of side B: ");
        sideC = askForDouble("Enter length of side C: ");
        
        try {
            triangle = new Triangle(sideA, sideB, sideC);
            displayPerimeterAndArea(triangle);
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage() + "\n\n");
        }
    }
    
    /**
     * Displays the area and perimeter of the specified shape.
     * 
     * @param shape 
     */
    private static void displayPerimeterAndArea(Polygon shape) {
        System.out.println();
        System.out.printf("Area: %.2f\n", shape.area());
        System.out.printf("Perimeter: %.2f\n", shape.perimeter());
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
            
            int shapeChosen = 0;
            
            if (reader.hasNextInt()) {
                shapeChosen = reader.nextInt();
            }
            
            reader.nextLine();
            
            // execute the method that matches the chosen option
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