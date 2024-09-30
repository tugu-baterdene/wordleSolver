package src.main.java;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parse = new Parser();
        ArrayList<String> guessWords = parse.parse("wordle_guesses.txt");
        ArrayList<String> answerWords = parse.parse("wordle_answers.txt");
        for(int i = 0; i < 10; i++) {
            System.out.println(answerWords.get(i));
        }
    }
}
