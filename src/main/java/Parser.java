package src.main.java;

import java.io.*;
import java.util.*;

public class Parser {
    public Parser() {

    }

    public ArrayList<String> parse(String filename) throws FileNotFoundException {
        // Return ArrayList of words
        ArrayList<String> words = new ArrayList<>();

        if (!filename.toLowerCase().endsWith(".txt")) { // Checks if it is a csv file
            throw new RuntimeException("Error: File should be a txt file");
        }
        Scanner scan = new Scanner(new File(filename));
        while(scan.hasNextLine()) {
            String line = scan.nextLine().trim();
            if(line.isEmpty())
                continue;
            if(!words.contains(line)) {
                words.add(line);
            }
        }
        scan.close();
        return words;
    }


}
