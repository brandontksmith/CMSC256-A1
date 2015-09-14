package com.btks.a1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class takes all the lines input to standard input and displays the lines
 * in reverse order, with the contents of each line reversed.
 * 
 * @author BTKS
 */
public class A1_Q2 {
    
    /**
     * The main method where the program starts.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numberOfLines = 0;
        int countLines = 1;
        
        ArrayList<String> lines = new ArrayList<String>();
        
        System.out.print("Enter number of lines: ");
        
        numberOfLines = Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter the lines: ");
        
        while (countLines <= numberOfLines && reader.hasNextLine()) {
            String line = reader.nextLine();

            lines.add(line);

            countLines++;
        }
        
        System.out.println("\nHere is the output:");
        
        // display the reversed lines in reverse order
        for (int i = lines.size() - 1; i >= 0; i--) {
            String line = lines.get(i);
            
            for (int j = line.length() - 1; j >= 0; j--) {
                System.out.print(line.charAt(j));
            }
            
            System.out.println();
        }
    }
    
}