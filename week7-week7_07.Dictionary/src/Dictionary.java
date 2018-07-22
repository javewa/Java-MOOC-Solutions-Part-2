/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    
    private HashMap<String, String> dict = new HashMap<String, String>();
    
    public String translate(String word) {
        String c = null;
        if (dict.containsKey(word)) {
            c = dict.get(word);
        }      
        return c;
    }
    
    public void add(String word, String translation) {
        dict.put(word, translation);
    }
    
    public int amountOfWords() {
        return dict.size();
    }
    
    public ArrayList<String> translationList() {
        int c = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (String key : dict.keySet()) {
            list.add(c, key + " = " + dict.get(key));
            c += 1;
        }
        return list;
    }
    
    
}
