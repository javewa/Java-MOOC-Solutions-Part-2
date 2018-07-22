/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author nacht
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordInspection {
    
    private File file;
    
    public WordInspection(File file) {
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int c = 0;
        while (reader.hasNext()) {
            reader.next();
            c += 1;
        }
        return c;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        List<String> words = new ArrayList<String>();
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("z")||word.contains("Z")) {
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        List<String> words = new ArrayList<String>();
        while (reader.hasNext()) {
            String word = reader.next();
            if ((word.endsWith("l"))) {
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        List<String> words = new ArrayList<String>();
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.equals(reverse(word))) {
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        List<String> words = new ArrayList<String>();
        boolean allVowels = true;
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                words.add(word);
            }
        }
        return words;
    }
    
    private String reverse(String s) {
   
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return rev;
        
        /*String reverse = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            reverse += s.charAt(length - i);
        }
        return reverse;*/
    }
    
}
