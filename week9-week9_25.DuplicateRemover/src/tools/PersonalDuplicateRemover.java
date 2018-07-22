/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;

/**
 *
 * @author nacht
 */
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> setStrings;
    private int duplicates;
    
    public PersonalDuplicateRemover() {
        this.setStrings = new HashSet<String>();
        this.duplicates = 0;
    }
    
    @Override
    public void add(String characterString) {
        if (!setStrings.contains(characterString)) {
            setStrings.add(characterString);
        } else {
            duplicates += 1;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return setStrings;
    }

    @Override
    public void empty() {
        setStrings = new HashSet<String>();
        duplicates = 0;
    }
    
    
    
}
