/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Tournament {
    
    private List<Jumper> jumpers = new ArrayList<Jumper>();
    
    public void addJumper(String name) {
        jumpers.add(new Jumper(name));
    }
    
    public void orderJumpers() {
        Collections.sort(jumpers);
    }
    
    public String jumpJumpers() {
        String newString = "";
        for (Jumper jumper : jumpers) {
            newString += "  " + jumper.getName() + "\n";
            newString += "    length: " + jumper.jump() + "\n";
            newString += "    judge votes: " + jumper.scores() + "\n";
        }
        return newString;
    }
    
    public String results() {
        String newString = "";
        int c = 1;
        Collections.reverse(jumpers);
        for (Jumper jumper : jumpers) {
            newString += c + "           " + jumper + "\n";
            newString += "            jump lengths: ";
            for (Integer jump : jumper.getJumps()) {
                newString += jump + " m";
                if (jumper.getJumps().indexOf(jump) != jumper.getJumps().size() - 1) {
                    newString += ", ";
                } else {
                    newString += "\n";
                }
            }
            c += 1;
        }
        return newString;
    }
    
    public String toString() {
        String newString = "";
        int c = 1;
        for (Jumper jumper : jumpers) {
            newString += "  " + c + ". " + jumper + "\n";
            c += 1;
        }
        return newString;
    }
    
}
