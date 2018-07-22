/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:\n    quit - quit the text user interface");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    add - adds a word pair to the dictionary");
        while (true) {
            System.out.println("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                System.out.println("In Finnish: ");
                String firstWord = reader.nextLine();
                System.out.println("Translation: ");
                String secondWord = reader.nextLine();
                add(firstWord, secondWord);
            } else if (input.equals("translate")) {
                System.out.println("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + translate(word));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    public void add(String firstWord, String secondWord) {
        dictionary.add(firstWord, secondWord);
    }
    
    public String translate(String word) {
        return dictionary.translate(word);
    }
}
