package com.btks.a1;

import java.io.FileNotFoundException;

/**
 * This is the main entry point of the application.
 * 
 * @author BTKS
 */
public class A1 {

    /**
     * The main method which bootstraps the application.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // the program has not been excuted properly; display instructions and exit
        if (args.length == 0) {
            System.out.println("ERROR: You have not specified which component to run.\n\n"
                                + "Please specify the component as an argument i.e. java -jar A1.jar Q1\n\n"
                                + "This program has the following components:\n\n"
                                + "Q1              reads a list of words and calculates occurrences\n"
                                + "Q2              reads strings and reverses string and order\n"
                                + "Q3              compute area and perimeter of polgygon(s) \n"
                                + "Q4 <input path> evaluate mathematical expressions");
            
            System.exit(-1);
        }
        
        // all arguments except the first argument; these will be passed to the main
        // method of the specified component/program
        String[] argsWithoutComponent = new String[args.length - 1];
        
        for (int i = 1; i < args.length; i++) {
            argsWithoutComponent[i - 1] = args[i];
        }
        
        if (args[0].equals("Q1")) {
            A1_Q1.main(argsWithoutComponent);
        } else if (args[0].equals("Q2")) {
            A1_Q2.main(argsWithoutComponent);
        } else if (args[0].equals("Q3")) {
            A1_Q3.main(argsWithoutComponent);
        } else if (args[0].equals("Q4")) {
            A1_Q4.main(argsWithoutComponent);
        } else {
            System.out.println("You have not executed the program properly. Please try again. Quitting.");
        }
    }
}