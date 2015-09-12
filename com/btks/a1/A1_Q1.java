package com.btks.a1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class takes a list of spaced-separated words, when prompted, and outputs
 * the number of occurrences of each unique word.
 * 
 * @author BTKS
 */
public class A1_Q1 {
    
    /**
     * The main method where the application starts.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        ArrayList<String> words = new ArrayList<String>();
        
        ArrayList<Integer> wordsCount = new ArrayList<Integer>();

        System.out.print("Enter list of words (space separated): ");
        
        String wordsString = reader.nextLine();

        // iterates through each word, adding new words to the words list, as
        // well as counting the occurrences
        for (String word : wordsString.split(" ")) {
            if (words.contains(word)) {
                int index = words.indexOf(word);
                
                wordsCount.set(index, wordsCount.get(index) + 1);
            } else {
                words.add(word);
                wordsCount.add(1);
            }
        }
        
        System.out.println("\nHere is the output:");
        
        // displays the occurrences of each word
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            int count = wordsCount.get(i);
            
            System.out.println(word + " " + count);
        }
    }
}