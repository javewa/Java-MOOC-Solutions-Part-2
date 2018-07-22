package dictionary;

import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    
    private Map<String, Set<String>> translations;
    
    public PersonalMultipleEntryDictionary() {
        this.translations = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if (!translations.containsKey(word)) {
            translations.put(word, new HashSet<String>());
        }
        
        Set<String> entries = translations.get(word);
        entries.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return translations.get(word);
    }

    @Override
    public void remove(String word) {
        translations.remove(word);
    }
    
    
    
}
