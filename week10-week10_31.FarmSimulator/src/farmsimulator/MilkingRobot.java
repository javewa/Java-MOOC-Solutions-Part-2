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
public class MilkingRobot {
    
    private BulkTank bulktank;
    
    public MilkingRobot() {
        this.bulktank = null;
    }
    
    public BulkTank getBulkTank() {
        return bulktank;
    }
    
    public void setBulkTank(BulkTank tank) {
        bulktank = tank;
    }
    
    public void milk(Milkable milkable) {
        if (bulktank == null) {
            throw new IllegalStateException();
        } else {
            bulktank.addToTank(milkable.milk());
        }     
    }
    
    
    
}
