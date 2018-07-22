/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author nacht
 */
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MindfulDictionary {
    
    private Map<String, String> dictionary;
    private String file;
    
    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<String, String>();
    }
    
    public boolean load() {
        File myFile = new File(file);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");
            dictionary.put(parts[0], parts[1]);
        }
        fileReader.close();
        return true;
    }
    
    public boolean save() {
        File myFile = new File(file);
        FileWriter writer = null;
        try {
            writer = new FileWriter(myFile);
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (String key : dictionary.keySet()) {
            try {
                writer.write(key + ":" + dictionary.get(key) + "\n");
            } catch (IOException ex) {
                Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(MindfulDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, translation);
    }
    
    public String translate(String word) {
        String c = null;
        if (dictionary.keySet().contains(word)) {
            c = dictionary.get(word);
        } else if (dictionary.values().contains(word)) {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    c = key;
                }
            }
        }
        return c;
    }
    
    public void remove(String word) {
        String c = "";
        if (dictionary.keySet().contains(word)) {
            dictionary.remove(word);
        } else if (dictionary.values().contains(word)) {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    c += key;
                }
            }
            dictionary.remove(c);
        }
    }
}
