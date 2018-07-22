/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author nacht
 */
public class ProductContainerRecorder extends ProductContainer{
    
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.history = new ContainerHistory();
        history.add(initialVolume);
    }
    
    public String history() {
        return history.toString();
    }
    
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(super.getVolume());
    }
    
    public double takeFromTheContainer(double amount) {
        if (super.getVolume() >= amount) {
            super.takeFromTheContainer(amount);
            history.add(super.getVolume());
        }
        return super.getVolume();
    }
    
    public String toString() {
        return super.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history);
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
    
    
}
