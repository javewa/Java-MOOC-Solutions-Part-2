/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;

public class Group implements Movable{
    
    private List<Movable> movables;
    
    public Group() {
        this.movables = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        movables.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
    
    public String toString() {
        String c = "";
        for (Movable movable : movables) {
            c += movable + "\n";
        }
        return c;
    }
    
    
    
}
