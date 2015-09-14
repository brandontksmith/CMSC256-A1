package com.btks.a1;

import com.btks.a1.q4.ExpressionParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class tests the ExpressionParser class written to evaluate mathematical
 * expressions contained in an input file.
 * 
 * @author BTKS
 */
public class A1_Q4 {
    
    /**
     * Formats and prints the number as either a whole number or as a number with
     * a decimal place.
     * 
     * @param number the number to format and print
     */
    private static void formatAndPrintNumber(double number) {
        String numberStr = Double.toString(number);
        
        // checks if number is a whole number
        if (number % 1 == 0) {
            int wholeNumber = Integer.parseInt(numberStr.substring(0, numberStr.indexOf('.')));
            
            numberStr = Integer.toString(wholeNumber);
        }
        
        System.out.println(numberStr);
    }
    
    /**
     * The main method where everything begins.
     * 
     * @param args command like arguments
     */
    public static void main(String[] args) {
        String fileName = "";
        FileReader file = null;
        
        // get the fileName passed as a command line argument
        if (args.length > 0) {
            fileName = args[0];
        } else {
            System.out.println("Error: Program must contain the path of the file as a command line argument.");
            System.exit(0);
        }
        
        try {
            file = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        
        Scanner s = new Scanner(file);
        
        ArrayList<String> list = new ArrayList<>();
        
        // read each line in the input file
        while (s.hasNextLine()) {
            String line = s.nextLine();
            
            // the line is blank; do not evaluate this line
            if (line.equals("") || line.equals(" ")) {
                continue;
            }
            
            list.add(line);
        }
        
        // evaluate and print out the result of each line
        for (String str : list) {
            double result = ExpressionParser.solve(str);
            
            formatAndPrintNumber(result);
        }
    }
}