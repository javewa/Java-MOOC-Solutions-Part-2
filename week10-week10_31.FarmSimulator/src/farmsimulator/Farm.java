/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author nacht
 */
import java.util.ArrayList;

public class Farm implements Alive{
    
    private String name;
    private Barn barn;
    private ArrayList<Cow> cows;
    
    public Farm(String name, Barn barn) {
        this.name = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner() {
        return name;
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
    
    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    public String toString() {
        String c = "Farm owner: " + name + "\nBarn bulk tank: " + barn.getBulkTank() + "\n";
        if (cows.isEmpty()) {
            c += "No cows.";
        } else {
            c += "Animals:\n";
            for (Cow cow : cows) {
                c += "        " + cow + "\n";
            }
        }
        return c;
    }
    
    
    
}
