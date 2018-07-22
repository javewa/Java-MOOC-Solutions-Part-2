/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Change {
    
    private char a;
    private char b;
    private String newString;
    
    public Change(char fromChar, char toChar) {
        this.a = fromChar;
        this.b = toChar;
        this.newString = "";
    }
    
    public String change(String characterString) {
        newString += characterString.replace(a, b);
        return newString;
    }  
}
