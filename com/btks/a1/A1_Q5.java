package com.btks.a1;

import com.btks.a1.q5.Box;
import com.btks.a1.q5.MaximumBoxes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class A1_Q5 {
    
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
        
        // evaluate and print out the maximum boxes for each line
        for (String str : list) {
            String[] boxesArr = str.split("#");
            Box[] boxes = new Box[Integer.parseInt(boxesArr[0])];

            for (int i = 1; i < boxesArr.length; i++) {
                String[] dims = boxesArr[i].split(",");

                int length = Integer.parseInt(dims[0]);
                int width = Integer.parseInt(dims[1]);
                int height = Integer.parseInt(dims[2]);

                Box box = new Box(length, width, height);

                boxes[i - 1] = box;
            }

            MaximumBoxes max = new MaximumBoxes(boxes);
            System.out.println(max.calculateMaxThatCanFit());
        }
    }
}