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
import java.util.Collection;

public class Barn {
    
    private BulkTank tank;
    private MilkingRobot milkingrobot;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingrobot) {
        this.milkingrobot = milkingrobot;
        milkingrobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow) {
        if (this.milkingrobot == null) { 
            throw new IllegalStateException();
        } else {
            milkingrobot.milk(cow);
        }    
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        if (this.milkingrobot == null) { 
            throw new IllegalStateException();
        } else {
            for (Cow cow : cows) {
                milkingrobot.milk(cow);
            }
        }    
    }
    
    public String toString() {
        return tank.toString();
    }
    
}
